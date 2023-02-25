package D_Poo;

public class Automobile { // template
    String brand;
    String model;
    String color = "silver";
    double displacement;
    int tankCapacity = 40;

    public String seeDetail() {
//        String model = "other";
        StringBuilder sb = new StringBuilder();
        sb.append("auto.brand = " + this.brand); // if it doesn't exist a var with the same name, it's not necessary to use "this."
        sb.append("\nauto.model = " + this.model);
//        sb.append("auto.model = " + model); // calling a local variable model
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.displacement = " + this.displacement);
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
        return km / (tankCapacity*percentageFuel);
    }

    public float calculateConsumptionFuel(int km, int percentageFuel) {
        return km / (tankCapacity*(percentageFuel/100f));
    }


}


// class entity; entity = (characteristic + behavior).
// classes cannot be private because it cannot invoke in other part of the program.
// class accepts encapsulation of public or default only.
// it is not a good practice to use SOUT in classes of entity like this one, it is better to use it in main class(return a var only).
