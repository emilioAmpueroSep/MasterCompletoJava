package D_Poo;

public class Engine {
    private double displacement;
    private TypeEngine type; // Enum

    public Engine() {
    }

    public Engine(double displacement, TypeEngine type) {
        this.displacement = displacement;
        this.type = type;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public TypeEngine getType() {
        return type;
    }

    public void setType(TypeEngine type) {
        this.type = type;
    }
}
