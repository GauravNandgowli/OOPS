package challenge_three;

public class Employee extends Worker {
    private int employee_ID;
    private String hireDate;

    Employee() {
        super();
        this.employee_ID = 00000;
        this.hireDate = "1/1/1";
    }

    Employee(int employee_ID) {
        this();
        this.employee_ID = employee_ID;

    }

    Employee(int employee_ID, String hireDate) {
        this.employee_ID = employee_ID;
        this.hireDate = hireDate;

    }

    Employee(int employee_ID,
            String hireDate, String name) {
        super(name);
        this.employee_ID = employee_ID;
        this.hireDate = hireDate;

    }

    Employee(int employee_ID,
            String hireDate, String name, String birthDate) {
        super(name, birthDate);
        this.employee_ID = employee_ID;
        this.hireDate = hireDate;

    }

    Employee(int employee_ID,
            String hireDate, String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
        this.employee_ID = employee_ID;
        this.hireDate = hireDate;
    }

    public int getEmployee_ID() {
        return this.employee_ID;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\n Emp ID = " + this.getEmployee_ID() +
                ",\n Hire date = " + this.getHireDate();
    }

}