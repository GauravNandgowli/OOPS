package challenge_three;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee(1000000, false, 31267);
        Worker s = new SalariedEmployee();
        s.getAge();
        System.out.println(emp1);
        System.out.println(emp1.getName());
        ;

    }
}
