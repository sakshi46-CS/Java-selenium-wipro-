package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCollection {

    class Department {
        private String name;
        private double sales;
        private double expenses;

        public Department(String name, double sales, double expenses) {
            this.name = name;
            this.sales = sales;
            this.expenses = expenses;
        }

        public double getProfit() {
            return sales - expenses;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Department Name: " + name +
                   ", Profit: " + getProfit();
        }
    }

    public static void main(String[] args) {
        ArrayList<Department> d = new ArrayList<>();
        JavaCollection jc = new JavaCollection();

        d.add(jc.new Department("Marketing", 10000, 25000));
        d.add(jc.new Department("Account", 15000, 35000));
        d.add(jc.new Department("Sales", 45000, 20000)); // profitable

        //  Sort using lambda
       d.sort((dept1, dept2) -> Double.compare(dept2.getProfit(), dept1.getProfit())); // descending order

        //  Print using lambda
        d.forEach(dept -> System.out.println(dept));
    }
}
