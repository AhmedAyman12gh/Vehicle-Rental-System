//import java.util.Arrays;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Rental System!");
        // 1. Setup
        Admin admin = new Admin("Super Admin", "admin@rent.com");
        Customer customer = new Customer("Alice", "alice@gmail.com");
        Car car = new Car("C001", "Toyota", "Camry", 2022, 60.0, 1, "Sedan");

        // 2. Customer makes a Request
        // The car quantity is still 1 here.
        Booking pendingRequest = customer.requestVehicle(car, LocalDate.now(), LocalDate.now().plusDays(5));

        System.out.println("--- Pending Approval ---");

        // 3. Admin Approves
        // This calls confirmBooking(), checks availability, and reduces quantity to 0.
        admin.approveBooking(pendingRequest);

        System.out.println("--- After Approval ---");
        System.out.println(car.getVehicleInfo()); // Should show quantity/availability changed
    }
}


/*
class GenericSort {
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
        // GenericSort.sortArray(vehicles); to use the method
    }
} */