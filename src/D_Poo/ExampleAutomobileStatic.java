package D_Poo;

public class ExampleAutomobileStatic {
    public static void main(String[] args) {

        Engine engineAuto4 = new Engine(1.8, TypeEngine.GASOLINE);
        Tank tankCapacityAuto4 = new Tank(35);

        Automobile.setTankCapacityStatic(45);
        Automobile auto = new Automobile("Subaru", "Impreza");
        auto.setEngine(new Engine(2.0, TypeEngine.GASOLINE));
        auto.setColor(Color.WHITE);
        auto.setType(TypeAutomobile.PICKUP);
//        Automobile.colorVehicleLicense = "green"; // (static) it change in all object simultaneously. // attribute public
        Automobile.setColorVehicleLicense(Color.BLUE); // attribute private

        Automobile auto2 = new Automobile("Mazda", "323", Color.RED, new Engine(1.8, TypeEngine.GASOLINE));
        auto2.setType(TypeAutomobile.SEDAN);
        Automobile auto3 = new Automobile("Nissan", "Navara", Color.YELLOW, new Engine(1.8, TypeEngine.GASOLINE), new Tank(45));
        auto3.setType(TypeAutomobile.PICKUP);
        Automobile auto4 = new Automobile("Nissan", "Navara", Color.YELLOW, engineAuto4, tankCapacityAuto4);
        auto4.setType(TypeAutomobile.PICKUP);
        Automobile auto5 = new Automobile();
        auto5.setType(TypeAutomobile.STATION_WAGON);
        // instance object used with final constant, not Enum:
        Automobile auto6 = new Automobile("Nissan", "Navara", Automobile.YELLOW_COLOR, new Engine(1.8, TypeEngine.GASOLINE), new Tank(45));
        auto6.setType(TypeAutomobile.PICKUP);

        System.out.println(auto.seeDetail2());
        System.out.println(auto2.seeDetail2());
        System.out.println(auto3.seeDetail2());
        System.out.println("Automobile.getColorVehicleLicense() = " + Automobile.getColorVehicleLicense().getColor());
        System.out.println(Automobile.calculateConsumptionFuelStatic(300, 60));
        System.out.println(Automobile.MAX_HIGHWAY_SPEED); // final constants we cannot change its value
        System.out.println(Automobile.MAX_CITY_SPEED);

//        Independent way to call methods of some Enum:
        TypeAutomobile typeSubaru = auto.getType();
        System.out.println("type Subaru: " + typeSubaru.getName());
        System.out.println("type desc. Subaru: " + typeSubaru.getDescription());
    }
}
