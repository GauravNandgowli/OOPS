package nested_class_three_static;

import nested_class_three_static.Car.Engine;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 2, "Sports", 8, 8, 3000);
        System.out.println();
        System.out.println(car.getCarType());
        System.out.println(car.getSeats());
        System.out.println(car.getType());
        System.out.println(car.getHorsePower());// runtime exception , because no engine object was created

        Car car1 = new Car(4, 2, "sedan", 8, 8, 6900000);
        System.out.println();
        System.out.println(car1.getCarType());
        System.out.println(car1.getSeats());
        System.out.println(car1.getType());
        System.out.println(car1.getHorsePower());// runtime exception , because no engine object was created

        System.out.println(car.getHorsePower());// if field is static it points to same object regardless of inner being
                                                // static or not
        Engine eng = new Engine(0, 0, 100000);
        System.out.println(eng.getHorsePower());// different obj
    }
}