package movie;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public
class Movie {
    private String name;
    private int numberOfRoom;
    private TypeOfMovie typeOfMovie;
    private StatusOfMovie statusOfMovie;
    private String duration;
    private int ticketPrice;
    private Category genre;

    public Movie(String name, int numberOfRoom, TypeOfMovie typeOfMovie, StatusOfMovie statusOfMovie, String duration, int ticketPrice, Category genre) {
        this.name = name;
        this.numberOfRoom = numberOfRoom;
        this.typeOfMovie = typeOfMovie;
        this.statusOfMovie = statusOfMovie;
        this.duration = duration;
        this.ticketPrice = ticketPrice;
        this.genre = genre;
    }
}
