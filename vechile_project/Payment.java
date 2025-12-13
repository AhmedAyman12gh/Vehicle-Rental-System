import java.time.LocalDate;

public class Payment {
    private String paymentId;       
    private Customer customer;
    private double amount;          
    private LocalDate paymentDate;  
    private static int paymentCounter = 0; 

    
    public Payment(Customer customer, double amount, LocalDate paymentDate) {
        if(customer == null) {
            throw new IllegalStateException("Customer cannot be null!");
        }

        if(amount <= 0) {
            throw new IllegalStateException("Amount must be positive!");
        }
        if(paymentDate == null) {
            throw new IllegalStateException("Payment date cannot be null!");
        }
        if (paymentDate.isAfter(LocalDate.now())) {
            throw new IllegalStateException("Payment date cannot be in the future!");
        }

        paymentCounter++;
        this.paymentId = "P" + paymentCounter; 
        this.customer = customer;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters
    public String getPaymentId() {
        return paymentId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    // Setters
    public void setAmount(double amount) {
        if(amount <= 0) {
            throw new IllegalStateException("Amount must be positive!");
        }
        this.amount = amount;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        if(paymentDate == null) {
            throw new IllegalStateException("Payment date cannot be null!");
        }
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return String.format(
            "Payment ID: %s, Customer: %s, Amount: %.2f, Payment Date: %s",
            paymentId, customer, amount, paymentDate
        );
    }
}
