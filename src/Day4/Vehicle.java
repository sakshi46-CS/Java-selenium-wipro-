package Day4;

// Abstract class
abstract class Vehicle {
    abstract void speed();
    abstract void Brand();
}

// Car class
class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed: 120km/h");
    }

    void Brand() {
        System.out.println("Brand: Toyota");
    }
}

// Bike class
class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike speed: 80km/h");
    }

    void Brand() {
        System.out.println("Brand: Honda");
    }
}


