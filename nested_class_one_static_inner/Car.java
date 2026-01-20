package nested_class_one_static_inner;

public class Car {

    private int wheels;
    private int seats;
    private String type;

    Car(int wheels, int seats, String type) {
        this.wheels = wheels;
        this.seats = seats;
        this.type = type;
    }

    public static class Engine {
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

    public String getType() {
        return type;
    }

}