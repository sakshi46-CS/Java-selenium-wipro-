package Day5;

public class FinalKeyword {
    final void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends FinalKeyword {
    // This method cannot override 'run' because it's declared final in the parent class
    //void run() { 
    //     System.out.println("Bike is running fast");
   //  }

    void show() {
        System.out.println("Bike class method");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
        b.show();
    }
}
