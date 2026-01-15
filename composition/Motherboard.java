package composition;

public class Motherboard extends Product {
    private int ramCapacity;
    private int ssdCapacity;
    private double biosVersion;

    public Motherboard(String model, String manufacturer, int ramCapacity, int ssdCapacity, double biosVersion) {
        super(model, manufacturer);
        this.ramCapacity = ramCapacity;
        this.ssdCapacity = ssdCapacity;
        this.biosVersion = biosVersion;
    }

    public int getRamCapacity() {
        return this.ramCapacity;
    }

    public int getSsdCapacity() {
        return this.ssdCapacity;
    }

    public double getBiosVersion() {
        return this.biosVersion;
    }

    public void loadBios() {
        System.out.println(
                "Loading BIOS version " + this.biosVersion + " on " + this.getModel());
    }

    public void BiosLoaded() {
        System.out.println(
                "BIOS Loaded Successfully:  " + this.biosVersion);
    }

}
