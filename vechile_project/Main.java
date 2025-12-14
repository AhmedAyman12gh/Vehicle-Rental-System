
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Rental System!");
        Car car1 = new Car("CAR123", "Toyota", "Camry", 2020, 50.0, 5, "Sedan");
        Car car2 = new Car("CAR123", "Toyota", "Camry", 2020, 50.0, 5, "Sedan");
        System.out.println(car2.getQuantity());
    }
}