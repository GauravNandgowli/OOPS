package composition;

public class Main {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("RGB Gaming", "corsair", 240);
        Motherboard motherboard = new Motherboard("Gaming", "Asus", 32, 2048, 5.5);
        Monitor monitor = new Monitor("OLED", "Asus", 64, 2040);

        Computer computer = new Computer("Nitro V15", "Acer", computerCase, motherboard, monitor);

        computer.start();
        System.out.println(computer.getSSDCapacity());
        ;
    }
}
