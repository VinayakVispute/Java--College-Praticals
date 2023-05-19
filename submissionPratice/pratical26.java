class Vehicle{
    int noOfWheels;

    public Vehicle(int noOfWheels){
        this.noOfWheels= noOfWheels;
    }
}

class TwoWheelers extends Vehicle{
    public TwoWheelers(){
    super(2);
    }
}
class Bike extends TwoWheelers{
    public Bike(){
    super();
    }
}
class Cycle extends TwoWheelers{
    public Cycle(){
    super();
    }
}

class FourWheelers extends Vehicle{
    public FourWheelers(){
    super(4);
    }
}

class cars extends FourWheelers{
    public cars(){
    super();
    }
}

class trucks extends FourWheelers{
    public trucks(){
    super();
    }
}

class pratical26{
    public static void main(String[] args) {
        TwoWheelers  bicycle = new Cycle();
        System.out.println("Now of Wheels of Bicycle"+bicycle.noOfWheels);

        TwoWheelers bike = new Bike();
        System.out.println("Now of Wheels of Bike"+bike.noOfWheels);

        FourWheelers truck = new trucks();
        System.out.println("Now of Wheels of Truck"+truck.noOfWheels);
        FourWheelers cars = new cars();
        System.out.println("Now of Wheels of cars"+cars.noOfWheels);

    }
}