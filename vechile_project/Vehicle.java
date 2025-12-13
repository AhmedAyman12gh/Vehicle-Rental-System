public abstract class Vehicle {

    

     private String vehicleId;      
    private String brand;          
    private String model;          
    private int year;            
    private double pricePerDay;  
    private boolean isAvailable;   

    public Vehicle(String vehicleId, String brand, String model, int year, double pricePerDay) {
         if (vehicleId == null || vehicleId.isBlank()) {
        throw new IllegalArgumentException("Vehicle ID cannot be null or empty");
    }

    if (brand == null || brand.isBlank()) {
        throw new IllegalArgumentException("Brand cannot be null or empty");
    }

    if (model == null || model.isBlank()) {
        throw new IllegalArgumentException("Model cannot be null or empty");
    }

    if (year < 1886) { 
        throw new IllegalArgumentException("Year is not valid");
    }

    if (pricePerDay <= 0) {
        throw new IllegalArgumentException("Price per day must be greater than 0");
    }
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    
}
    public abstract  String getVehicleId();
    public abstract String getBrand();
    public abstract String getModel();
    public abstract int getYear();
    public abstract double getPricePerDay();
    public abstract double setPricePerDay();
    public abstract boolean isAvailable();
    public abstract void setAvailable(boolean available);
    public abstract String getVehicleInfo();
    @ Override
    public String toString(){
        return getVehicleInfo();
    }


}
   

    