package Day3;

public abstract class Bank {
    protected double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Payment of ₹" + amount + " processed.");
    }

    public abstract void makePayment();  
}

