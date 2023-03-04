package D_Poo;

import java.util.Date;

public class ExampleAutomobile {
    public static void main(String[] args) {

        Engine engineAuto4 = new Engine(2.0, TypeEngine.GASOLINE); // we can do a var new instance of some class.

        Automobile auto = new Automobile("Subaru", "Impreza"); // we instance the object Automobile, and we save in the memory of program the reference towards this object.
        Automobile auto2 = new Automobile("Mazda", "323", Color.RED, new Engine(2.0, TypeEngine.DIESEL)); // instantiating a new object called auto2
        Automobile auto3 = new Automobile("Nissan", "Navara", Color.YELLOW, new Engine(4.0, TypeEngine.GASOLINE));
        Automobile auto4 = new Automobile("Nissan", "Navara", Color.YELLOW, engineAuto4, new Tank(50));
        Automobile auto5 = new Automobile();
        Date date = new Date();
/*

// Not hidden:
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

 */
// Hidden:
//        auto.setBrand("Subaru");
//        auto.setModel("Impreza");
//        auto.setColor("black");
        auto.setEngine(new Engine(2.0, TypeEngine.GASOLINE));
        auto.setTank(new Tank());
//        System.out.println("auto2.brand = " + auto.getBrand());

//        auto2.setBrand("Mazda");
//        auto2.setModel("323");
//        auto2.setColor("white");
//        auto2.setDisplacement(1.8);
//        System.out.println("auto2.brand = " + auto2.getBrand());

        System.out.println("Are they equal? " + (auto3 == auto4));
        System.out.println("Are they equal? " + (auto3.equals(auto4)));
        System.out.println("Are they equal? " + (auto3.equals(auto5)));
        System.out.println("Are they equal? " + (auto3.equals(date)));

        System.out.println(auto3); // implicit to string
        System.out.println(auto3.toString()); // explicit to string

        System.out.println(auto.seeDetail2());
        System.out.println(auto2.seeDetail2());
        System.out.println(auto3.seeDetail2());


        System.out.println(auto.speedUp(3000));
        System.out.println(auto.brake());

        System.out.println(auto2.speedUpBrake(45000));

        System.out.println("km per liters " + auto.calculateConsumptionFuel(300, 0.6f));
        System.out.println("km per liters " + auto.calculateConsumptionFuel(300, 60));
        System.out.println("km per liters " + auto3.calculateConsumptionFuel(300, 60));

    }
}
