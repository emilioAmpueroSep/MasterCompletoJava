package D_Poo;

public class ExampleAutomobile {
    public static void main(String[] args) {

        Automobile auto = new Automobile(); // we instance the object Automobile and we save in the memory of program the referece towards this object

        auto.brand = "Subaru";
        auto.model = "Impreza";
        auto.color = "black";
        auto.displacement = 2.0;
//        System.out.println("auto.brand = " + auto.brand); System.out.println("auto.model = " + auto.model); System.out.println("auto.color = " + auto.color); System.out.println("auto.displacement = " + auto.displacement);

        Automobile auto2 = new Automobile(); // instantiating a new object called auto2
        auto2.brand = "Mazda";
        auto2.model = "323";
        auto2.color = "white";
        auto2.displacement = 1.8;
//        System.out.println("auto2.brand = " + auto2.brand); System.out.println("auto2.model = " + auto2.model); System.out.println("auto2.color = " + auto2.color); System.out.println("auto2.displacement = " + auto2.displacement);

        System.out.println(auto.seeDetail());
        System.out.println(auto2.seeDetail());
        System.out.println(auto.speedUp(3000));
        System.out.println(auto.brake());

        System.out.println(auto2.speedUpBrake(45000));

        System.out.println("km per liters " + auto.calculateConsumptionFuel(300, 0.6f));
        System.out.println("km per liters " + auto.calculateConsumptionFuel(300, 60));

    }
}
