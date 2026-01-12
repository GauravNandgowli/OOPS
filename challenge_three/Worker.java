package challenge_three;

import java.time.LocalDate;
import java.time.Period;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    Worker() {
        this.name = "anonymous";
        this.birthDate = "1/1/1";
        this.endDate = "12/12/12";
    }

    Worker(String name) {
        this();
        this.name = name;

    }

    Worker(String name, String birthDate) {
        this(name);
        this.birthDate = birthDate;

    }

    Worker(String name, String birthDate, String endDate) {
        this(name, birthDate);
        this.endDate = endDate;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getendDate() {
        return this.endDate;
    }

    public int getAge() {
        LocalDate birth = LocalDate.parse(this.birthDate);

        // Get current date
        LocalDate today = LocalDate.now();

        // Calculate age
        return Period.between(birth, today).getYears();
    }

    public void collectPay() {
        System.out.println("double pay collected");
    }

    public void terminate() {
        System.out.println("terminated");
    }

    @Override
    public String toString() {
        return " \n name = " + this.getName() +
                ", \n birth date = " + this.getBirthDate() +
                ", \n end date = " + this.getendDate();
    }

}
