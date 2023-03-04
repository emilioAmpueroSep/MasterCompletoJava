package D_Poo;

public class Wheel {
    private String brand;
    private int ring;
    private double width;

    public Wheel(String brand, int ring, double width) {
        this.brand = brand;
        this.ring = ring;
        this.width = width;
    }

    public String getBrand() {
        return brand;
    }

    public int getRing() {
        return ring;
    }

    public double getWidth() {
        return width;
    }
}
