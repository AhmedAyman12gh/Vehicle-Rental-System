public class Bike extends Vehicle {
   
    private String bikeType; // e.g., Minivan, Cargo Van, Passenger Van, etc.
    private boolean Available;
     
    
    
    
    public Bike(String vehicleId, String brand, String model, int year, double pricePerDay, int quantity, String bikeType) {
        super(vehicleId, brand, model, year, pricePerDay, quantity);
        this.bikeType = bikeType;
    }
    
    public String getBikeType() {
        return bikeType;
    }
    @Override
    public String getVehicleInfo() {
        return "Car [ID=" + getVehicleId() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", Year=" + getYear() +
               ", PricePerDay=" + getPricePerDay() + ", CarType=" + getBikeType() + ", Available=" + isAvailable() + "]";
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

   
    