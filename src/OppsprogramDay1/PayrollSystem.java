package OppsprogramDay1;

//Abstract Class – Employee Payroll System
public class PayrollSystem {

 // Abstract base class
 static abstract class Employee {
     String name;
     int empId;

     public Employee(String name, int empId) {
         this.name = name;
         this.empId = empId;
     }

     // Abstract method
     abstract double calculateSalary();

     // Common method
     public void display() {
         System.out.println("Employee ID: " + empId);
         System.out.println("Employee Name: " + name);
     }
 }

 // Full-time employee class
 static class FullTimeEmployee extends Employee {
     double monthlySalary;

     public FullTimeEmployee(String name, int empId, double monthlySalary) {
         super(name, empId);
         this.monthlySalary = monthlySalary;
     }

     @Override
     double calculateSalary() {
         return monthlySalary;
     }
 }

 // Part-time employee class
 static class PartTimeEmployee extends Employee {
     int hoursWorked;
     double ratePerHour;

     public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
         super(name, empId);
         this.hoursWorked = hoursWorked;
         this.ratePerHour = ratePerHour;
     }

     @Override
     double calculateSalary() {
         return hoursWorked * ratePerHour;
     }
 }

 // Main method
 public static void main(String[] args) {
     Employee e1 = new FullTimeEmployee("Chetan", 101, 50000);
     Employee e2 = new PartTimeEmployee("Gagan", 102, 80, 300);

     e1.display();
     System.out.println("Salary: ₹" + e1.calculateSalary());

     System.out.println();

     e2.display();
     System.out.println("Salary: ₹" + e2.calculateSalary());
 }
}

