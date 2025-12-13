public abstract class Vehicle {

     private String vehicleId;      
    private String brand;          
    private String model;          
    private int year;            
    private double pricePerDay;  
    private boolean isAvailable;   

    public Vehicle(String vehicleId, String brand, String model, int year, double pricePerDay) {
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
    public abstract boolean isAvailable();
    public abstract void setAvailable(boolean available);
    public abstract String getVehicleInfo();
    @ Override
    public String toString(){
        return getVehicleInfo();
    }


}
   

    