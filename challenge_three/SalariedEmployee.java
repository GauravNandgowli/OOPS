package challenge_three;

public class SalariedEmployee extends Employee {
    private double annualPackage;
    private boolean retire;

    SalariedEmployee() {
        super();
        this.annualPackage = 0000000;
        this.retire = false;
    }

    SalariedEmployee(double annualPackage) {
        this();
        this.annualPackage = annualPackage;
    }

    SalariedEmployee(double annualPackage, boolean retire) {
        this(annualPackage);
        this.retire = retire;
    }

    SalariedEmployee(double annualPackage, boolean retire, int employee_ID) {
        super(employee_ID);
        this.annualPackage = annualPackage;
        this.retire = retire;
    }

    SalariedEmployee(double annualPackage, boolean retire, int employee_ID, String hireDate) {
        super(employee_ID, hireDate);
        this.annualPackage = annualPackage;
        this.retire = retire;
    }

    SalariedEmployee(double annualPackage, boolean retire, int employee_ID, String hireDate, String name) {
        super(employee_ID, hireDate, name);
        this.annualPackage = annualPackage;
        this.retire = retire;
    }

    SalariedEmployee(double annualPackage, boolean retire, int employee_ID, String hireDate, String name,
            String birthDate) {
        super(employee_ID, hireDate, name, birthDate);
        this.annualPackage = annualPackage;
        this.retire = retire;
    }

    SalariedEmployee(double annualPackage, boolean retire, int employee_ID, String hireDate, String name,
            String birthDate, String endDate) {
        super(employee_ID, hireDate, name, birthDate, endDate);
        this.annualPackage = annualPackage;
        this.retire = retire;
    }

    public void retire() {
        this.retire = true;
    }

    public double annualPackage() {
        return this.annualPackage;
    }

    @Override
    public String toString() {
        return "{" + super.toString()
                +
                "\n annualPackage=" + this.annualPackage +
                ",\n retire=" + this.retire
                + "\n}";
    }
}
