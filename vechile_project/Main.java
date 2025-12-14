
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Rental System!");
        Car car1 = new Car("C001", "Toyota", "Camry", 2020, 50.0,5, "Sedan");
        car1.addQuantity(3);
        System.out.println(car1.getVehicleInfo());
    }
}