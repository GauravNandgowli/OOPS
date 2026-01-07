public class main {
    public static void main(String[] args) {
        account acc = new account();
        acc.display();
        System.out.println("-----------------------------------");
        acc.set_acc_number(789456);
        acc.display();
        System.out.println("-----------------------------------");
        acc.set_cust_name("ram");
        acc.display();
        System.out.println("-----------------------------------");
        acc.set_email("ram@gmail.com");
        acc.display();
        System.out.println("-----------------------------------");
        acc.set_phone_num("8277712345");
        acc.display();
        System.out.println("-----------------------------------");
        acc.withdraw_money(100000);
    }
}
