package com.eampuero.dpoo;

public class ExampleAutomobileRelationsObject {
    public static void main(String[] args) {

        // Vars:
        Engine engineAuto4 = new Engine(1.8, TypeEngine.GASOLINE);
        Tank tankCapacityAuto4 = new Tank(35);


//        wheelsAuto[0] = new Wheel("Yokohama", 16, 7.5);
//        wheelsAuto[1] = new Wheel("Yokohama", 16, 7.5);
//        wheelsAuto[2] = new Wheel("Yokohama", 16, 7.5);
//        wheelsAuto[3] = new Wheel("Yokohama", 16, 7.5);
//        wheelsAuto[4] = new Wheel("Yokohama", 16, 7.5);


        // Auto:
        Person driverAuto = new Person("Antonio", "Pino");
        Automobile.setTankCapacityStatic(45);
        Automobile auto = new Automobile("Subaru", "Impreza");
        auto.setEngine(new Engine(2.0, TypeEngine.GASOLINE));
        auto.setColor(Color.WHITE);
        auto.setType(TypeAutomobile.PICKUP);
        Automobile.setColorVehicleLicense(Color.BLUE);
        auto.setDriver(driverAuto);
//        auto.setWheel(wheelsAuto);
        Wheel[] wheelsAuto = new Wheel[5];
        for (int i = 0; i < wheelsAuto.length; i++) {
            auto.addWheels(new Wheel("Yokohama", 16, 7.5));
        }


        // Auto2:
//        Wheel[] wheelsAuto2 = {new Wheel("Michelin", 18, 10.5),
//                new Wheel("Michelin", 18, 10.5),
//                new Wheel("Michelin", 18, 10.5),
//                new Wheel("Michelin", 18, 10.5),
//                new Wheel("Michelin", 18, 10.5),
//        };
        Person carla = new Person("Carla", "Garcia");
        Automobile auto2 = new Automobile("Mazda", "323", Color.RED, new Engine(1.8, TypeEngine.GASOLINE));
        auto2.setType(TypeAutomobile.SEDAN);
        auto2.setDriver(carla);
//        auto2.setWheel(wheelsAuto2);
        Wheel[] wheelsAuto2 = new Wheel[5];
        for (int i = 0; i < wheelsAuto2.length; i++) {
            auto2.addWheels(new Wheel("Michelin", 18, 10.5));
        }


        // Auto3:
        Person raul = new Person("Raul", "Prado");
        Automobile auto3 = new Automobile("Nissan", "Navara", Color.YELLOW, new Engine(1.8, TypeEngine.GASOLINE), new Tank(45));
        auto3.setDriver(raul);
        auto3.setType(TypeAutomobile.PICKUP);
        // other way to add data to an array (encadenados)
        auto3.addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5));


        // Auto4:
        Wheel[] wheelsAuto4 = {new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
                new Wheel("Pirelli", 20, 11.5),
        };
        Person lalo = new Person("Lalo", "Rifo");
        Automobile auto4 = new Automobile("Nissan", "Navara", Color.YELLOW, engineAuto4, tankCapacityAuto4, lalo, wheelsAuto4);
        auto4.setType(TypeAutomobile.PICKUP);


//      Show info:
        System.out.println(auto.seeDetail2());
        System.out.println(auto2.seeDetail2());
        System.out.println(auto3.seeDetail2());


        TypeAutomobile typeSubaru = auto.getType();
        System.out.println("type Subaru: " + typeSubaru.getName());
        System.out.println("type desc. Subaru: " + typeSubaru.getDescription());

//        Showing wheels:
//        System.out.println("Driver Auto: " + auto.getDriver()); // it gonna show full name of driver by default (toString implicit).
//        System.out.println("Wheel Auto: ");
//        for (Wheel wh : auto.getWheel()) {
//            System.out.println(wh.getBrand() + ", ring: " + wh.getRing() + ", width: " + wh.getWidth());
//        }
//        System.out.println();
    }
}
