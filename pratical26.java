class Vehicle{
    int NoOfWheels;
    public Vehicle(int NoOfWheels) {
        this.NoOfWheels = NoOfWheels;
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        super(2);
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler() {
        super(4);
    }
}
class Bicycle extends TwoWheeler {
    public Bicycle() {
        super();
    }
}

class Motorcycle extends TwoWheeler {
    public Motorcycle() {
        super();
    }
}

class Car extends FourWheeler {
    public Car() {
        super();
    }
}

class Truck extends FourWheeler {
    public Truck() {
        super();
    }
}

class pratical26{
    public static void main(String[] args){
        TwoWheeler bicycle = new Bicycle();
        System.out.println("Bicycle has " + bicycle.NoOfWheels + " wheels");

        TwoWheeler motorcycle = new Motorcycle();
        System.out.println("Motorcycle has " + motorcycle.NoOfWheels + " wheels");

        FourWheeler car = new Car();
        System.out.println("Car has " + car.NoOfWheels + " wheels");

        FourWheeler truck = new Truck();
        System.out.println("Truck has " + truck.NoOfWheels + " wheels");
    }
}