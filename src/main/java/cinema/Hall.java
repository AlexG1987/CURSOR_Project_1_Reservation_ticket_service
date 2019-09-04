package cinema;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public
class Hall {
    private String cinema;
    private int number;
    private int amountOfPlaces;
    private TypeOfPlace typeOfPlace;

    public Hall(String cinema, int number, int amountOfPlaces, TypeOfPlace typeOfPlace) {
        this.cinema = cinema;
        this.number = number;
        this.amountOfPlaces = amountOfPlaces;
        this.typeOfPlace = typeOfPlace;
    }
}
