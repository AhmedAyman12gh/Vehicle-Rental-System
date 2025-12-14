import java.time.LocalDate;

public class Customer extends User {

    public Customer(String name, String email) {
        super(name, email);
    }

    // New: Customer initiates a request
    // This creates a Booking object but DOES NOT finalize the rent.
    public Booking requestVehicle(Rentable vehicle, LocalDate rentalDate, LocalDate returnDate) {
        Booking request = new Booking(this, vehicle, rentalDate, returnDate);
        System.out.println("Request submitted by " + getName() + " for " + vehicle.getDescription());
        return request;
    }
}
