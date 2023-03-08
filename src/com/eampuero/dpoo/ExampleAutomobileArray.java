package com.eampuero.dpoo;

import java.util.Arrays;

public class ExampleAutomobileArray {
    public static void main(String[] args) {

        // Vars:
        Engine engineAuto4 = new Engine(1.6, TypeEngine.GASOLINE);
        Tank tankCapacityAuto4 = new Tank(35);


        // Auto:
        Person driverAuto = new Person("Antonio", "Pino");
        Automobile.setTankCapacityStatic(45);
        Automobile auto = new Automobile("Subaru", "Impreza");
        auto.setEngine(new Engine(2.0, TypeEngine.GASOLINE));
        auto.setColor(Color.WHITE);
        auto.setType(TypeAutomobile.PICKUP);
        Automobile.setColorVehicleLicense(Color.BLUE);
        auto.setDriver(driverAuto);

        // Auto2:
        Person carla = new Person("Carla", "Garcia");
        Automobile auto2 = new Automobile("Mazda", "323", Color.RED, new Engine(1.8, TypeEngine.GASOLINE));
        auto2.setType(TypeAutomobile.SEDAN);
        auto2.setDriver(carla);


        // Auto3:
        Person raul = new Person("Raul", "Prado");
        Automobile auto3 = new Automobile("Nissan", "Navara", Color.YELLOW, new Engine(1.8, TypeEngine.GASOLINE), new Tank(45));
        auto3.setDriver(raul);
        auto3.setType(TypeAutomobile.PICKUP);


        // Auto4:
        Person lalo = new Person("Lalo", "Rifo");
        Automobile auto4 = new Automobile("Suzuki", "Vitara", Color.YELLOW, engineAuto4, tankCapacityAuto4);
        auto4.setDriver(lalo);
        auto4.setType(TypeAutomobile.SUV);

        Automobile auto5 = new Automobile("Audi", "A3");
        auto5.setDriver(new Person("Jano", "Perez"));

        Automobile[] autos = new Automobile[5];
        autos[0] = auto;
        autos[1] = auto2;
        autos[2] = auto3;
        autos[3] = auto4;
        autos[4] = auto5;

        Arrays.sort(autos); // Error ComparableTimSort, to solve we must use an interface.
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]); // we print toString of Automobile
        }


    }
}
