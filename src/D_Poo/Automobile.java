package D_Poo;

public class Automobile { // template

    // 1. Attributes:
    private String brand;
    private String model;
    private String color = "silver";
    private double displacement;
    private int tankCapacity = 40;

    public Automobile() {

    }

    // 2. Constructors:
    public Automobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Automobile(String brand, String model, String color) {
        this(brand, model); // A way to bring attributes of other constructor similar. to coding less lines.
        this.color = color;
    }

    public Automobile(String brand, String model, String color, double displacement) {
        this(brand, model, color); // A way to bring attributes of other constructor similar. to coding less lines.
        this.displacement = displacement;
    }

    public Automobile(String brand, String model, String color, double displacement, int tankCapacity) {
        this(brand, model, color, displacement); // A way to bring attributes of other constructor similar. to coding less lines.
        this.tankCapacity = tankCapacity;
    }


    // 3. Setters and Getters:
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getDisplacement() {
        return displacement;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }


    // 4. Operation methods(calculate, queries; etc.)
    public String seeDetail() {
//        String model = "other";
        StringBuilder sb = new StringBuilder();
        sb.append("auto.brand = " + this.brand); // if it doesn't exist a var with the same name, it's not necessary to use "this."
        sb.append("\nauto.model = " + this.model);
//        sb.append("auto.model = " + model); // calling a local variable model
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.displacement = " + this.displacement);
        sb.append("\nauto.tankCapacity = " + this.tankCapacity);
        return sb.toString(); // return something
    }

    // other way to do the same method above:
    public String seeDetail2() {
        return "auto.brand = " + this.brand +
                "\nauto.model = " + this.model +
                "\nauto.color = " + this.color +
                "\nauto.displacement = " + this.displacement;
    }

    public String speedUp(int rpm) {
        return "the car " + this.brand + " is accelerating at " + rpm + " rpm";
    }

    public String brake() {
        return this.brand + " " + this.model + " breaks on!";
    }

    // It can join 2 or more methods to create another method including them
    public String speedUpBrake(int rpm) {
        String speedUp = this.speedUp(rpm);
        String brake = this.brake();
        return speedUp + "\n" + brake;
    }

    public float calculateConsumptionFuel(int km, float percentageFuel) {
        return km / (tankCapacity * percentageFuel);
    }

    public float calculateConsumptionFuel(int km, int percentageFuel) {
        return km / (tankCapacity * (percentageFuel / 100f));
    }

// 5. Fix or overide method:

    // this notation is not obligatory; here we are over writting method which is located in object class(father):
    @Override // changing the behavior of method to comparate arguments, not the objects. (polymorphism)
    public boolean equals(Object obj) {
        if (this == obj) { // comparing for reference(both are the same)
            return true;
        }
        if (!(obj instanceof Automobile)) { // instanceof, compare if obj it's or not of Automobile type.
            return false;
        }
        Automobile a = (Automobile) obj; // casting obj to Automobile class
        return (this.brand != null && this.model != null
                && this.brand.equals(a.getBrand())
                && this.model.equals(a.getModel()));
    }
}

/*
 - class entity; entity = (characteristic + behavior).
 - classes cannot be private because it cannot be invoked in other part of the program.
 - class accepts encapsulation(visibility) of type public or default only.
 - it is not a good practice to use SOUT in classes of entity like this one, it is better to use it in main class(return a var only).
 - It's a good practice private or protected variables or attributes.
 - getter and setter is a standart to read and modify attributes (hidden) and both words must be used in the methods.
 - constructor methods is a method type void but that word is no used on it. it's only used for inicialiting an object with data or
 without data (it can exist more than 1 constructor method). And it cannot be invoked like a common metohd.
 - All objects are differents, even though they have the same arguments added in its parameters.
 - We can over write methods that exists by default to change its behavior, we have to add notation @override

 */