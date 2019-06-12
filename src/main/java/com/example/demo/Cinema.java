package com.example.demo;

public class Cinema {
    private final double comedyMoviePrice = 22.5;
    private final double horrorMoviePrice = 32.5;
    private final double otherMoviePrice = 15.5;
    private int tickets;
    private double total;
    private double budget;
    private String movie;

    public Cinema(double availableBudget, int numberOfTickets) {
        budget = availableBudget;
        tickets = numberOfTickets;
    }

    public void setMovie(String chooseMovie) {
        movie = chooseMovie;
    }

    public void setTotal() {
        switch (movie.toLowerCase()) {
            case "comedy":
                total = comedyMoviePrice * tickets;
                break;
            case "horror":
                total = horrorMoviePrice * tickets;
                break;
            default:
                total = otherMoviePrice * tickets;
        }
    }

    public String ifCanGoToCinema() {
        return budget <= total ? "You don't have enough budget" : "You bought " + tickets + " tickets for " + movie + " film with total price " + total + ".";
    }


}
