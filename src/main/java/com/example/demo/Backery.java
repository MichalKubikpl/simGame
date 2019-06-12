package com.example.demo;

public class Backery {
    private final double cheeseCakePrice = 5;
    private final double lemonCakePrice = 10;
    private final double donoughtPrice = 3;
    private int orderSize;
    private double total;
    private double budget;
    private String cakeType;


    public Backery(double availabeBudget, int numberOfCakes) {
        budget = availabeBudget;
        orderSize = numberOfCakes;
    }

    public void setCakeType(String chooseCakeType) {
        cakeType = chooseCakeType;
    }

    public void setTotal() {
        switch (caketype.toLowerCase()) {
            case "cheese cake":
                total = cheeseCakePrice * orderSize;
                break;
            case "lemon cake":
                total = lemonCakePrice * orderSize;
                break;
            case "donought":
                total = donoughtPrice * orderSize;
        }
    }
}



/*


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
    }*/
