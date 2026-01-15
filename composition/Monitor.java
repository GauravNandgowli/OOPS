package composition;

public class Monitor extends Product {

    private int size;
    private int resolution;

    public Monitor(String model, String manufacturer, int size, int resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize() {
        return this.size;
    }

    public int getResolution() {
        return this.resolution;
    }

    public void displayLogo() {
        System.out.println(
                "Displaying " + this.getManufacturer() + " logo on " + this.size + " inch monitor");
    }

    public void welcomeUser() {
        System.out.println("Hello User!");
    }
}
