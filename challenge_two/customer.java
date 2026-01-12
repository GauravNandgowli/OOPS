package challenge_two;

public class customer {
    private int credit_limit = 123456;
    private int acc_balance = 1000;
    private String cust_name = "Gaurav Nandgowli";

    customer(int credit_limit, int acc_balance, String cust_name) {
        // apply object rules here to validate input data, if any violation,obj does not
        // exist
        this.credit_limit = credit_limit;
        this.acc_balance = acc_balance;
        this.cust_name = cust_name;
    }

    customer(int credit_limit, String cust_name) {
        this(credit_limit, 6969696, cust_name);

    }

    customer(String cust_name) {
        this(0, 6969696, cust_name);

    }

    customer() {
        this(0, 0, "no_name");
    }

    public void display() {
        System.out.println("Displaying Account Information");
        System.out.println("Account Number: " + get_get_credit_limit());
        System.out.println("Account Balance: " + get_acc_balance());
        System.out.println("Customer Name: " + get_cust_name());

    }

    public int get_get_credit_limit() {
        return this.credit_limit;
    }

    public int get_acc_balance() {
        return this.acc_balance;
    }

    public String get_cust_name() {
        return this.cust_name;
    }

}
