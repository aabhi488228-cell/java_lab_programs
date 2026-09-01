interface Drivable {
    void drive();
}

interface Honkable {
    void horn();
}

class Car implements Drivable, Honkable {

    public void drive() {
        System.out.println("Car is driving");
    }

    public void horn() {
        System.out.println("Car horn: Beep beep!");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.horn();
    }
}