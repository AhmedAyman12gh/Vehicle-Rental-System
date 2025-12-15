import java.util.Arrays;

import java.time.LocalDate;

public class Main {

    class GenericSort {
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
        // GenericSort.sortArray(vehicles); to use the method
    }
}

    public static void main(String[] args) {

        //  Admin admin = new Admin("John Admin", "admin@rental.com");
        // Customer customer = new Customer("Alice Customer", "alice@gmail.com");
        
        // // Create vehicle
        // Car car = new Car("C001", "Toyota", "Camry", 2022, 60.0, 2, "Sedan");

        // System.out.println("=== TEST 1: Customer requests vehicle ===");
        // Booking booking = customer.requestVehicle(car, LocalDate.now(), LocalDate.now().plusDays(5));
        // System.out.println("Booking Status: " + booking.getStatus());

        // System.out.println("\n=== TEST 2: Admin approves booking ===");
        // admin.approveBooking(booking);
        // System.out.println("Booking Status: " + booking.getStatus());
        // System.out.println("Car quantity: " + car.getQuantity());

        // System.out.println("\n=== TEST 3: Admin adds vehicle quantity ===");
        // admin.addVehicleQuantity(car, 3);
        // System.out.println("Car quantity after addition: " + car.getQuantity());

        // System.out.println("\n=== TEST 4: Customer tries to add quantity (SHOULD FAIL) ===");
        // try {
        //     car.addQuantity(5, customer); // This should throw exception
        // } catch (SecurityException e) {
        //     System.out.println("✓ Security check passed: " + e.getMessage());
        // }

        // System.out.println("\n=== TEST 5: Customer tries to approve booking (SHOULD FAIL) ===");
        // try {
        //     customer.attemptApproveBooking(booking);
        // } catch (SecurityException e) {
        //     System.out.println("✓ Security check passed: " + e.getMessage());
        // }

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("C002", "Honda", "Civic", 2021, 55.0, 5, "Sedan");
        vehicles[1] = new Bike("B001", "Yamaha", "YZF-R3", 2020, 40.0, 3, "Sport");
        vehicles[2] = new Car("C003", "Ford", "Mustang", 2023, 80.0, 2, "Coupe");

        System.out.println("\n=== TEST 6: Sorting vehicles by price per day ===");
        GenericSort.sortArray(vehicles);
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    
    }
}




