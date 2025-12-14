import java.time.LocalDate;
public class Booking {
    private String bookingId;
    private Customer customer;
    private Rentable rentedItem; // Using the Interface type!
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private double totalCost;
    private boolean isPaid;
    public static int bookingCounter = 0; 

    public Booking(Customer customer, Rentable rentedItem, LocalDate rentalDate, LocalDate returnDate) {
        
        // 1. Validate Customer
        if (customer == null) {
            throw new IllegalArgumentException("Error: Customer cannot be null.");
        }

        // 2. Validate Item
        if (rentedItem == null) {
            throw new IllegalArgumentException("Error: Rented item cannot be null.");
        }

        // 3. Validate Dates exist
        if (rentalDate == null || returnDate == null) {
            throw new IllegalArgumentException("Error: Dates cannot be null.");
        }

        // 4. Validate Date Logic (Time Travel Check)
        if (returnDate.isBefore(rentalDate)) {
            throw new IllegalArgumentException("Error: Return date cannot be before rental date.");
        }
        this.bookingId = "B" + bookingCounter;
        this.customer = customer;
        this.rentedItem = rentedItem;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.isPaid = false;
        calculateTotalCost();
        bookingCounter++;
    }
     private void calculateTotalCost() {
        long days = java.time.temporal.ChronoUnit.DAYS.between(rentalDate, returnDate);
        this.totalCost = rentedItem.getRentalPrice((int) days);
    }

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Rentable getRentedItem() {
        return rentedItem;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }   

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void makePayment() {
        this.isPaid = true;
    }
    public String getDetails() {
        return "Booking ID: " + bookingId + "\n" +
               "Customer: " + customer.getName() + "\n" +
               "Vehicle: " + rentedItem.getDescription() + "\n" +
               "Total Cost: $" + totalCost;
    }

    public void confirmBooking() {
    if (!rentedItem.isAvailable()) {
        throw new IllegalStateException("Error: Vehicle is not available for rent.");
    }
    this.isPaid = true;
    rentedItem.rent(customer, (int) java.time.temporal.ChronoUnit.DAYS.between(rentalDate, returnDate));
    
    System.out.println("Booking Confirmed for " + customer.getName());
    }
}
