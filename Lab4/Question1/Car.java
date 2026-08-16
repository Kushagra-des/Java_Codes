class Car extends Vehicle {
    int speed = 100; 

    void displaySpeeds() {
        System.out.println("Car speed: " + speed);      
        System.out.println("Vehicle speed: " + super.speed);
    }
}
