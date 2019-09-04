package handlers;

import booking.Booking;
import booking.Client;
import cinema.Cinema;
import cinema.Hall;
import movie.Category;
import movie.Movie;
import movie.StatusOfMovie;
import movie.TypeOfMovie;
import cinema.TypeOfPlace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHandler {

    public static List<Client> getUserList() {
        List<Client> clientsList = new ArrayList<>();
        clientsList.add(new Client("Alex", "First", 25, "alexfirst@domain.com", "+380501234567"));
        clientsList.add(new Client("Alice", "Second", 22, "alisasecond@domain.com", "+380991234567"));
        clientsList.add(new Client("Becky", "Third", 27, "beckythirf@domain.com", "+380671234567"));
        clientsList.add(new Client("Bob", "Fourth", 21, "bobfourth@domain.com", "+380631234567"));
        clientsList.add(new Client("Jack", "Fifth", 18, "jackfifth@domain.com", "+380951234567"));
        clientsList.add(new Client("John", "Sixth", 29, "johnsixth@domain.com", "+380981234567"));
        clientsList.add(new Client("Joanna", "Seventh", 31, "joannaseventh@domain.com", "+380691234567"));
        clientsList.add(new Client("Linda", "Eights", 28, "lindaeighs@domain.com", "+380671234567"));
        clientsList.add(new Client("Lois", "Ninth", 23, "loisninth@domain.com", "+380681234567"));
        clientsList.add(new Client("Rebecka", "Tenth", 24, "rebeckatenth@domain.com", "+380931234567"));
        return clientsList;
    }

    public static List<Cinema> getCinemaList() {
        List<Cinema> cinemaList = new ArrayList<>();
        cinemaList.add(new Cinema("Premier Hall", "One street, 56, LA, USA", 8.6, movieListPremierHall));
        cinemaList.add(new Cinema("Cinema Hall", "Second street, 35, LA, USA", 7.8, movieListCinemaHall));
        cinemaList.add(new Cinema("Best Movies", "Third street, 21, LA, USA", 8.1, movieListBestMovies));
        return cinemaList;
    }

    public static List<Hall> getCinemaHall() {
        List<Hall> hallList = new ArrayList<>();
        hallList.add(new Hall("Premier Hall", 1, 60, TypeOfPlace.NORMAL));
        hallList.add(new Hall("Premier Hall", 2, 40, TypeOfPlace.PREMIUM));
        hallList.add(new Hall("Premier Hall", 3, 30, TypeOfPlace.VIP));
        hallList.add(new Hall("Cinema Hall", 1, 50, TypeOfPlace.NORMAL));
        hallList.add(new Hall("Cinema Hall", 2, 30, TypeOfPlace.PREMIUM));
        hallList.add(new Hall("Best Movies", 1, 30, TypeOfPlace.PREMIUM));
        hallList.add(new Hall("Best Movies", 2, 10, TypeOfPlace.VIP));
        return hallList;
    }

    public static List<Booking> tBookingList = new ArrayList<>();

    public static List<Movie> movieListPremierHall = Arrays.asList(
            new Movie("Avatar", 3, TypeOfMovie.ORIGINAL, StatusOfMovie.PREMIERE, "2019-08-01 - 2019-08-15", 120, Category.ACTION),
            new Movie("Avengers", 2, TypeOfMovie.TRANSLATED, StatusOfMovie.PREMIERE, "2019-08-15 - 2019-08-30", 100, Category.ACTION),
            new Movie("It", 1, TypeOfMovie.ORIGINAL, StatusOfMovie.PRE_PREMIERE, "2019-08-15 - 2019-07-30", 80, Category.THRILLER),
            new Movie("Mirrors", 2, TypeOfMovie.TRANSLATED, StatusOfMovie.AVAILABLE, "2019-08-01 - 2019-08-30", 100, Category.HORROR),
            new Movie("Interstellar", 3, TypeOfMovie.TRANSLATED, StatusOfMovie.PRE_PREMIERE, "2019-08-15 - 2019-08-30", 120, Category.FANTASTIC)
    );

    private static List<Movie> movieListCinemaHall = Arrays.asList(
            new Movie("X-men", 2, TypeOfMovie.TRANSLATED, StatusOfMovie.PRE_PREMIERE, "2019-08-01 - 2019-07-30", 80, Category.ACTION),
            new Movie("Predator", 1, TypeOfMovie.TRANSLATED, StatusOfMovie.AVAILABLE, "2019-08-15 - 2019-08-30", 100, Category.ACTION),
            new Movie("Rambo", 3, TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, "2019-07-01 - 2019-08-30", 80, Category.ACTION),
            new Movie("Martian", 1, TypeOfMovie.TRANSLATED, StatusOfMovie.PREMIERE, "2019-08-01 - 2019-07-30", 120, Category.ACTION),
            new Movie("The Fast and the Furious", 2, TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, "2019-08-15 - 2019-08-30", 80, Category.ACTION)
    );

    private static List<Movie> movieListBestMovies = Arrays.asList(
            new Movie("Fantastic Four", 1, TypeOfMovie.TRANSLATED, StatusOfMovie.PRE_PREMIERE, "2019-08-01 - 2019-07-30", 140, Category.ACTION),
            new Movie("Steve Jobs", 1, TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, "2019-08-15 - 2019-08-30", 100, Category.DRAMA),
            new Movie("The Lord of the Rings", 1, TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, "2019-07-15 - 2019-07-30", 80, Category.FANTASY),
            new Movie("The Earth", 1, TypeOfMovie.TRANSLATED, StatusOfMovie.PREMIERE, "2019-08-15 - 2019-08-30", 60, Category.DOCUMENTARY),
            new Movie("The Mask", 1, TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, "2019-08-01 - 2019-08-30", 100, Category.COMEDY)
    );

    public static List<Movie> getAllMoviesList() {
        List<Movie> allCinemaList = new ArrayList<>(movieListPremierHall);
        allCinemaList = Stream.concat(movieListCinemaHall.stream(), movieListBestMovies.stream())
                .collect(Collectors.toList());
        return allCinemaList;
    }

    public static List<Cinema> getCinemaSortedByRating(){
        //stream of cinemas sorted by rating
        return null;
    }

    public static List<Movie> getAllMoviesByCategory(String category){
        //stream of movies by category
        return null;
    }

}
