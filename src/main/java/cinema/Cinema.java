package cinema;

import lombok.Getter;
import lombok.NoArgsConstructor;
import movie.Movie;

import java.util.List;

@Getter
@NoArgsConstructor
public
class Cinema {
    private String name;
    private String address;
    private double rating;
    private List<Movie> listOfMovies;

    public Cinema(String name, String address, double rating, List<Movie> listOfMovies) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.listOfMovies = listOfMovies;
    }
}
