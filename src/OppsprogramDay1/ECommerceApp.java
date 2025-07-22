package OppsprogramDay1;

//E-Commerce Payment System using Interface
public class ECommerceApp {

 // Interface
 interface PaymentMode {
     void pay(double amount);
 }

 // UPI Payment implementation
 static class UpiPayment implements PaymentMode {
     public void pay(double amount) {
         System.out.println("Paid ₹" + amount + " via UPI.");
     }
 }

 // Credit Card Payment implementation
 static class CreditCardPayment implements PaymentMode {
     public void pay(double amount) {
         System.out.println("Paid ₹" + amount + " using Credit Card.");
     }
 }

 // Cash on Delivery implementation
 static class CashOnDelivery implements PaymentMode {
     public void pay(double amount) {
         System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
     }
 }

 // Main method
 public static void main(String[] args) {
     PaymentMode payment;

     payment = new UpiPayment();
     payment.pay(1500.00);

     payment = new CreditCardPayment();
     payment.pay(3200.00);

     payment = new CashOnDelivery();
     payment.pay(2000.00);
 }
}

