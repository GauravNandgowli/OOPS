package nested_class_three;

public class Car {

    private int wheels;
    private int seats;
    private String CarType;
    private Engine internalEngine;

    Car(int wheels, int seats, String CarType, int type, int cylinders, int horsePower) {
        this.wheels = wheels;
        this.seats = seats;
        this.CarType = CarType;
        this.internalEngine = new Engine(8, 8, 3000);
    }

    // private static class Engine This means class does not belong to an instance
    // of the outer class
    private static class Engine {
        int type;
        int cylinders;
        int horsePower;

        Engine(int type, int cylinders, int horsePower) {
            this.type = type;
            this.cylinders = cylinders;
            this.horsePower = horsePower;
        }

        public int getType() {
            return type;
        }

        public int getCylinders() {
            return cylinders;
        }

        public int getHorsePower() {
            return horsePower;
        }

    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getCarType() {
        return CarType;
    }

    public int getType() {
        return internalEngine.getType();
    }

    public int getCylinders() {
        return internalEngine.getCylinders();
    }

    public int getHorsePower() {
        return internalEngine.getHorsePower();
    }

}