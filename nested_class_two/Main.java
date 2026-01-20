package nested_class_two;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 2, "Sports", 8, 8, 3000);
        System.out.println();
        System.out.println(car.getSeats());
        System.out.println(car.getType());
        System.out.println(car.getHorsePower());// runtime exception , because no engine object was created
        ;
    }
}