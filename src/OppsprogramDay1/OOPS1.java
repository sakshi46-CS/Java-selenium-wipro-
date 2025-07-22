package OppsprogramDay1;


public class OOPS1 {


 static class BankAccount {
     private String accountHolder;
     private double balance;

  
     public BankAccount(String accountHolder, double initialBalance) {
         this.accountHolder = accountHolder;
         this.balance = initialBalance;
     }

   
     public void deposit(double amount) {
         balance += amount;
         System.out.println(amount + " deposited. New Balance: " + balance);
     }

 
     public void withdraw(double amount) {
         if (amount > balance) {
             System.out.println("Insufficient balance.");
         } else {
             balance -= amount;
             System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
         }
     }

 
     public void displayDetails() {
         System.out.println("Account Holder: " + accountHolder);
         System.out.println("Balance: " + balance);
     }
 }


 public static void main(String[] args) {
     BankAccount account = new BankAccount("Harini", 1000);
     account.deposit(500);
     account.withdraw(300);
     account.displayDetails();
 }
}
