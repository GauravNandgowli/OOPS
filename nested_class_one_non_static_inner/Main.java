package nested_class_one_non_static_inner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 2, "Sports");
        System.out.println();
        System.out.println(car.getSeats());
        System.out.println(car.getType());
        // Engine engine = new Engine(1, 4, 150); If engine class is private you cannot
        // do this
        // Engine eng = new Engine(8, 8, 3000); cannot also create this directly as this
        // is non static, so it is only available if the outer class object exists and
        // can be accessible from there.
        Car.Engine eng = car.new Engine(8, 8, 3000);
        System.out.println(eng.getHorsePower());

    }
}