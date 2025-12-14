public class Van extends Vehicle implements Rentable {
   
    private String vanType; // e.g., Minivan, Cargo Van, Passenger Van, etc.
    private boolean Available;
     
    
    
    
    public Van(String vehicleId, String brand, String model, int year, double pricePerDay, int quantity, String vanType) {
        super(vehicleId, brand, model, year, pricePerDay, quantity);
        this.vanType = vanType;
    }
    
    public String getVanType() {
        return vanType;
    }
    @Override
    public String getVehicleInfo() {
        return "Car [ID=" + getVehicleId() + ", Brand=" + getBrand() + ", Model=" + getModel() + ", Year=" + getYear() +
               ", PricePerDay=" + getPricePerDay() + ", CarType=" + getVanType() + ", Available=" + isAvailable() + "]";
    }


    public void setAvailable(boolean available) {
        this.Available = available;
    }

   


    // implementing Rentable interface methods

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setQuantity(getQuantity() - 1);
            System.out.println("Van rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Van is not available for rent.");
        }
        
    }

    @Override
    public double getRentalPrice(int days) {   // Calculate rental price
        return getPricePerDay() * days;
    }

    @Override
    public void returnItem() {    // Return the rented van
        setQuantity(getQuantity() + 1);
        System.out.println("Van returned successfully.");   // Confirmation message
    }

    @Override
    public String getDescription() {    
        return "Van: " + getBrand() + " " + getModel() + " (" + getYear() + "), Type: " + getVanType();
    }

    @Override
    public int compareTo(Rentable other) {   // Compare based on vehicle ID 
        if (other instanceof Vehicle) {
            Vehicle otherVehicle = (Vehicle) other;
            return this.getVehicleId().compareTo(otherVehicle.getVehicleId());
        }
        return 0;
    }

     @Override
    public boolean isAvailable(){
        return super.isAvailable();
    }
    
    






}

   
    
    
    
    
    

    
   
   

    

