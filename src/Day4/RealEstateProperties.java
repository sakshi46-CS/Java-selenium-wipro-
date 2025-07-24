package Day4;

class Property {
    int food;
    double rent;

    Property(int food, double rent) {
        this.food = food;
        this.rent = rent;
    }

    // Method Overloading: 3 versions of totalMonthlyExpenses()

    void totalMonthlyExpenses() {
        double total = food + rent;
        System.out.println("Total Monthly Expenses: ₹" + total);
    }

    void totalMonthlyExpenses(double electricity) {
        double total = food + rent + electricity;
        System.out.println("Total Monthly Expenses (with electricity): ₹" + total);
    }

    void totalMonthlyExpenses(double electricity, double water) {
        double total = food + rent + electricity + water;
        System.out.println("Total Monthly Expenses (with electricity & water): ₹" + total);
    }

    // Property type (to be overridden)
    void propertyType() {
        System.out.println("Generic Property");
    }
}

// House class
class House extends Property {
    House(int food, double rent) {
        super(food, rent);
    }

    @Override
    void propertyType() {
        System.out.println("Property Type: House");
    }
}

// Apartment class
class Apartment extends Property {
    Apartment(int food, double rent) {
        super(food, rent);
    }

    @Override
    void propertyType() {
        System.out.println("Property Type: Apartment");
    }
}

// Main class
public class RealEstateProperties {
    public static void main(String[] args) {
        // Polymorphism: superclass reference → subclass object
        Property p1 = new House(3000, 12000.50);
        p1.propertyType();
        p1.totalMonthlyExpenses(); // basic
        p1.totalMonthlyExpenses(1500); // with electricity
        p1.totalMonthlyExpenses(1500, 500); // with electricity + water

        System.out.println("---------------------------");

        Property p2 = new Apartment(5000, 40000);
        p2.propertyType();
        p2.totalMonthlyExpenses();
        p2.totalMonthlyExpenses(2000);
        p2.totalMonthlyExpenses(2000, 800);
    }
}
