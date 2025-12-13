public interface Rentable extends Comparable<Rentable> {
    public boolean isAvailable();  // Check if the item is available for rent
    public void rent(Customer customer, int days); // Rent the item to a customer for a specified number of days
    public double getRentalPrice(int days); // Get the rental price for a specified number of days
    public void returnItem(); // Return the rented item
    public String getDescription(); // Get a description of the rentable item

}
