package composition;

public class Computer extends Product {
    ComputerCase computerCase;
    Motherboard motherboard;
    Monitor monitor;

    public Computer(String model, String manufacturer, ComputerCase computerCase, Motherboard motherboard,
            Monitor monitor) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void start() {
        computerCase.pressPowerButton();
        computerCase.computerIsOn();
        motherboard.getBiosVersion();
        motherboard.BiosLoaded();
        monitor.displayLogo();
        monitor.welcomeUser();
    }

    public double getBiosVersion() {
        return motherboard.getBiosVersion();
    }

    public int getSSDCapacity() {
        return motherboard.getSsdCapacity();
    }

    public int getRamCapacity() {
        return motherboard.getRamCapacity();
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

}
