package D_Poo;

public class Automobile { // template

    // 1. Attributes:
    private int id;
    private String brand;
    private String model;
    private String color = Automobile.GREY_COLOR;
    private double displacement;
    private int tankCapacity = 40;
    private static String colorVehicleLicense = Automobile.ORANGE_COLOR; // patente vehicular
    private static int tankCapacityStatic = 30;
    private static int lastId;
    public static final int MAX_HIGHWAY_SPEED = 120; // constant
    public static final int MAX_CITY_SPEED = 60; // constant
    public static final String RED_COLOR = "red";
    public static final String YELLOW_COLOR = "yellow";
    public static final String BLUE_COLOR = "blue";
    public static final String WHITE_COLOR = "white";
    public static final String GREY_COLOR = "grey";
    public static final String ORANGE_COLOR = "orange";


    // 2. Constructors:
    public Automobile() {
        this.id = ++lastId; // autoincrement id
    }

    public Automobile(String brand, String model) {
        this(); // invoke attributes before
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


    // 3. Getters Setters:


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    // get to read a static var:
    public static String getColorVehicleLicense() {
        return colorVehicleLicense;
    }

    // Set to modify a static var:
    public static void setColorVehicleLicense(String colorVehicleLicense) {
        Automobile.colorVehicleLicense = colorVehicleLicense;
    }

    public static int getTankCapacityStatic() {
        return tankCapacityStatic;
    }

    public static void setTankCapacityStatic(int tankCapacityStatic) {
        Automobile.tankCapacityStatic = tankCapacityStatic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "auto.id = " + this.id +
                "\nauto.brand = " + this.brand +
                "\nauto.model = " + this.model +
                "\nauto.color = " + this.color +
                "\nauto.ColorVehicleLicense = " + Automobile.colorVehicleLicense + // .this must not be used in static variables, but we can use only the name the attribute or its class more its name
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

    // example of static methods:
    public static float calculateConsumptionFuelStatic(int km, int percentageFuel) {
        return km / (tankCapacityStatic * (percentageFuel / 100f));
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

    // toString is a method of Object class which is used for show a class in String format (String array)

    @Override
    public String toString() {
        return "Automobile{" +
                "id='" + id + '\'' +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
//                ", color='" + color + '\'' +
//                ", displacement=" + displacement +
//                ", tankCapacity=" + tankCapacity +
                '}';
    }

}

/*
 - class entity; entity = (characteristic + behavior).
 \
 - classes cannot be private because it cannot be invoked in other part of the program.

 - class accepts encapsulation(visibility) of type public or default only.

 - it is not a good practice to use SOUT in classes of entity like this one, it is better to use it in main class(return a var only).

 - It's a good practice private or protected variables or attributes.

 - getter and setter is a standard to read and modify attributes (hidden) and both words must be used in the methods.

 - constructor methods is a method type void but that word is not used on it. it's only used for initializing an object with data or
 without data (it can exist more than 1 constructor method). And it cannot be invoked like a common method.

 - All objects are different, even though they have the same arguments added in its parameters.

 - We can overwrite methods that exists by default to change its behavior, we have to add notation @override

 - Static var or methods belong to class not objects(instance of object); if I change a value of attribute static, it is going to change in all the other objects that use it.
 - to call ir, I have to code: ex: Car.wheels not this.wheels (.this is forbidden) and we must use only vars in methods statics and vice verse.

 - final vars (constants) normally it is used with public visibility(sometimes private) and static behavior, and its value cannot be changed.
 - we must initialize and declare vars final at the same time (we cannot do initialize and then declare it).
 - we can parameterize with constants statics in its use.
 */