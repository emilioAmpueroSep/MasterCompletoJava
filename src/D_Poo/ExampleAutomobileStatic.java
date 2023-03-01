package D_Poo;

public class ExampleAutomobileStatic {
    public static void main(String[] args) {

        Automobile.setTankCapacityStatic(45);
        Automobile auto = new Automobile("Subaru", "Impreza");
        auto.setDisplacement(2.0);
        auto.setColor(Automobile.WHITE_COLOR);
//        Automobile.colorVehicleLicense = "green"; // (static) it change in all object simultaneously. // attribute public
        Automobile.setColorVehicleLicense(Automobile.BLUE_COLOR); // attribute private

        Automobile auto2 = new Automobile("Mazda", "323", Automobile.RED_COLOR, 1.8);
        Automobile auto3 = new Automobile("Nissan", "Navara", Automobile.YELLOW_COLOR, 1.5, 50);
        Automobile auto4 = new Automobile("Nissan", "Navara", Automobile.YELLOW_COLOR, 1.5, 50);
        Automobile auto5 = new Automobile();

        System.out.println(auto.seeDetail2());
        System.out.println(auto2.seeDetail2());
        System.out.println(auto3.seeDetail2());
        System.out.println("Automobile.getColorVehicleLicense() = " + Automobile.getColorVehicleLicense());
        System.out.println(Automobile.calculateConsumptionFuelStatic(300,60));
        System.out.println(Automobile.MAX_HIGHWAY_SPEED); // final constants we cannot change its value
        System.out.println(Automobile.MAX_CITY_SPEED);
    }
}
