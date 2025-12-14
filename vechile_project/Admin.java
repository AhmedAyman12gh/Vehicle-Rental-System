
public class Admin extends User {

    // Constructor matching the abstract User class
    public Admin(String name, String email) {
        super(name, email);
    }

    // 1. Manage Inventory: Only Admin can add quantity
    public void addVehicleQuantity(Vehicle vehicle, int quantity) {
        if (vehicle == null) {
            System.out.println("Error: Vehicle cannot be null.");
            return;
        }
        try {
            // Pass 'this' (the Admin object) as proof of authority
            vehicle.addQuantity(quantity, this);
            System.out.println("Successfully added " + quantity + " to " + vehicle.getBrand() + " " + vehicle.getModel());
        } catch (Exception e) {
            System.out.println("Failed to add quantity: " + e.getMessage());
        }
    }

    // 2. Manual Rent: Admin manually rents a vehicle to a customer
    public void rentVehicle(Rentable vehicle, Customer customer, int days) {
        if (vehicle == null || customer == null) {
            System.out.println("Error: Vehicle or Customer cannot be null.");
            return;
        }
        try {
            // Pass 'this' to authorize the rent
            vehicle.rent(customer, days, this);
        } catch (Exception e) {
            System.out.println("Rent failed: " + e.getMessage());
        }
    }

    // 3. Approve Request: Admin approves a booking created by a Customer
    public void approveBooking(Booking booking) {
        if (booking == null) {
            System.out.println("Error: No booking provided to approve.");
            return;
        }

        try {
            // Confirm the booking, which triggers the rental logic inside Booking
            booking.confirmBooking(this);
            System.out.println("Booking " + booking.getBookingId() + " has been APPROVED.");
        } catch (Exception e) {
            System.out.println("Approval Failed: " + e.getMessage());
        }
    }
}