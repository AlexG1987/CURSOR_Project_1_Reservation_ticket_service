package booking;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public
class Booking {
    private LocalDate bookedDate;
    private PaymentStatus paymentStatus;
    private List <String> bookedMovies;
    private  int amount;

    public Booking(LocalDate bookedDate, PaymentStatus paymentStatus, List<String> bookedMovies, int amount) {
        this.bookedDate = bookedDate;
        this.paymentStatus = paymentStatus;
        this.bookedMovies = bookedMovies;
        this.amount = amount;
    }
}
