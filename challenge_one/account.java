public class account {
    private int acc_number = 123456;
    private int acc_balance = 1000;
    private String cust_name = "Gaurav Nandgowli";
    private String email = "gaurav@gmail.com";
    private String phone_num = "6363612345";

    int withdraw_money(int ask) {
        // no withdarwal if balance is negative
        if (this.acc_balance <= 0)
            return 1;
        this.acc_balance -= ask;
        display();
        return 0;
    }

    int deposit_money(int deposit) {
        this.acc_balance += deposit;
        return 0;
    }

    public void display() {
        System.out.println("Displaying Account Information");
        System.out.println("Account Number: " + get_acc_number());
        System.out.println("Account Balance: " + get_acc_balance());
        System.out.println("Customer Name: " + get_cust_name());
        System.out.println("Customer Email: " + get_email());
        System.out.println("Customer Phone Number: " + get_phone_num());
    }

    public int get_acc_number() {
        return this.acc_number;
    }

    public int get_acc_balance() {
        return this.acc_balance;
    }

    public String get_cust_name() {
        return this.cust_name;
    }

    public String get_email() {
        return this.email;
    }

    public String get_phone_num() {
        return this.phone_num;
    }

    public int set_acc_number(int acc_num) {
        if (acc_num < 100000 || acc_num > 999999)
            return 1;
        this.acc_number = acc_num;
        return 0;
    }

    public int set_cust_name(String cust_name) {
        if (!(cust_name instanceof String))
            return 1;
        this.cust_name = cust_name;
        return 0;
    }

    public int set_email(String email) {
        if (email == null || !isValidEmail(email)) {
            System.out.println("Invalid email format");
            return 1;
        }
        this.email = email;
        return 0;
    }

    public int set_phone_num(String phone_num) {
        if (phone_num.length() != 10)
            return 1;
        this.phone_num = phone_num;
        return 0;
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }
}
