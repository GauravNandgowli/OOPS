package composition;

public class ComputerCase extends Product {
    private int powerSupply;

    public ComputerCase(String model, String manufacturer, int powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public int getPowerSupply() {
        return this.powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed. Supplying " + this.powerSupply + "W");
    }

    public void computerIsOn() {
        System.out.println("Computer is on");
    }
}
