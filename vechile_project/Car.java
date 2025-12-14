public class Car extends Vehicle  {
    private String carType; // e.g., Sedan, SUV, Coupe, etc.
    private boolean Available;
     
    
    
    
    public Car(String vehicleId, String brand, String model, int year, double pricePerDay, int quantity, String carType) {
        super(vehicleId, brand, model, year, pricePerDay, quantity);
        this.carType = carType;
    }
    
    public String getCarType() {
        return carType;
    }
    @Override
    public String getVehicleInfo() {
        return "Car [ID=" + getVehicleId() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", Year=" + getYear() +
               ", PricePerDay=" + getPricePerDay() + ", CarType=" + getCarType() + ", Available=" + isAvailable() + "]";
    }




    public void setAvailable(boolean available) {
        this.Available = available;
    }


    public boolean isAvailable(){
        return Available;
    }
    
    
    // // Check if the item is available for rent
    // public void rent(Customer customer, int days){


    // } // Rent the item to a customer for a specified number of days
    // public double getRentalPrice(int days){
       

    // } // Get the rental price for a specified number of days
    // public void returnItem(){

    // } // Return the rented item
    // public String getDescription(){
       

    // }// Get a description of the rentable item
}
