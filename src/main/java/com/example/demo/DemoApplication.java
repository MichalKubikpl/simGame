package com.example.demo;

import java.util.Scanner;

public class DemoApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me your name please.");
        String imie = scan.nextLine();
        System.out.println("Give me your surname please.");
        String nazwisko = scan.nextLine();
        System.out.println("Give me your age please.");
        int wiek = scan.nextInt();
        Sim sim = new Sim(wiek, nazwisko, imie);
        System.out.println("Hi " + sim.firstName + " " + sim.surname);
        System.out.println(sim.firstName + " How much money are you willing to spend");
        double budget = scan.nextDouble();
        System.out.println("What kind of a cake do u want to buy");
        String cakeType = scan.nextLine();
        System.out.println("How many pieces of cake do u wanna buy");
        int numerOfPieces = scan.nextInt();
    }
/*

    public static void main(String[] args) {
        String imie;
        String nazwisko;
        int wiek;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give a name for Your Sim:");
        imie = scan.nextLine();
        System.out.println("Podaj nazwisko sima:");
        nazwisko = scan.nextLine();
        System.out.println("Podaj wiek sima:");
        wiek = scan.nextInt();
        Sim sim = new Sim(wiek, nazwisko, imie);
        System.out.println("Hi " + sim.firstName + " " + sim.surname);
        System.out.println(sim.firstName + " what budget do you have?");
        double budget = scan.nextDouble();
        System.out.println("Do you want to go to cinema for comedy,horror or other?(true, false)");
        if (doYouWannaGo(scan)) {
            System.out.println("For which type of movie comedy, horror or other?");
            scan.nextLine();
            String movie = scan.nextLine();
            System.out.println("How many tickets do you need?");
            int tickets = scan.nextInt();
            Cinema goToCinema = new Cinema(budget, tickets);
            goToCinema.setMovie(movie);
            goToCinema.setTotal();
            System.out.println(goToCinema.ifCanGoToCinema());
        } else {
            System.out.println("Maybe next time...");
        }
    }



    private static boolean doYouWannaGo(Scanner scan) {
        boolean doYouWannaGo;
        try {
            doYouWannaGo = scan.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Please answer: true or false");
            scan.next();
            doYouWannaGo = doYouWannaGo(scan);
        }
        return doYouWannaGo;
    }
}
*/
