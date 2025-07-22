 package OppsprogramDay1;
public class polymorphism {

    // Superclass
    static class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Subclass: Circle
    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle");
        }
    }

    // Subclass: Rectangle
    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    // Main method
    public static void main(String[] args) {
        Shape s1 = new Circle();     // Upcasting
        Shape s2 = new Rectangle();  // Upcasting

        s1.draw();  // Calls Circle's draw()
        s2.draw();  // Calls Rectangle's draw()
    }
}
