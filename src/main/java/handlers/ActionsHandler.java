package handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActionsHandler {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void menuAction() throws IOException {
        System.out.println("<= Hi, i am cinema agent, what you want to do? =>");
        int choice = 0;
        System.out.println("Please, chose your action:");
        System.out.println("1. Choose cinema\n"
                + "2. Print a list of all movies\n"
                + "3. Search movie via category\n"
                + "4. Exit");
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input data!");
                break;
            }
        }
        while ((choice > 4) || (choice <= 0));
        switch (choice) {
            case 1:
                cinemaAction();
                break;
            case 2:
                System.out.println("LIst of all movies in your city:" + ListHandler.getAllMoviesList());
                break;
            case 3:
                SearchHandler.searchMovieByGenre(reader.readLine());
                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
                break;
        }
    }

    public static void cinemaAction() throws IOException {
        int choice = 0;
        System.out.println("What do you want to do next?\n" +
                "1. Choose a cinema from list\n"
                + "2. See all movies sorted by rating\n"
                + "3. See all movies sorted by category\n"
                + "4. Back to previous menu\n");
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input data!");
                break;
            }
        }
        while ((choice > 4) || (choice <= 0));
        switch (choice) {
            case 1:

                break;
            case 2:
                ListHandler.getCinemaSortedByRating();
                break;
            case 3:
                ListHandler.getAllMoviesByCategory(reader.readLine());
                break;
            case 4:
                System.out.println("Back to main menu");
                ActionsHandler.menuAction();
                break;
        }

    }
}


