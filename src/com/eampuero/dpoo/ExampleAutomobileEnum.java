package com.eampuero.dpoo;

public class ExampleAutomobileEnum {
    public static void main(String[] args) {
        Engine engineAuto2 = new Engine(3.5, TypeEngine.DIESEL);

        Automobile.setTankCapacityStatic(45);
        Automobile auto = new Automobile("Subaru", "Impreza");
        auto.setEngine(new Engine(2.0, TypeEngine.GASOLINE));
        auto.setColor(Color.WHITE);
        auto.setType(TypeAutomobile.HATCHBACK);

        Automobile auto2 = new Automobile("Mazda", "323", Color.RED, engineAuto2);
        auto2.setType(TypeAutomobile.SEDAN);

        TypeAutomobile type = auto.getType();
        System.out.println("type Subaru: " + type.getName());
        System.out.println("type desc. Subaru: " + type.getDescription());

        type = auto2.getType();

        switch (type) {
            // since jdk 13 forward: (without break;) is automatic.
//            case CONVERTIBLE -> System.out.println("The car is sport and convertible of 2 doors");
//            case COUPE -> System.out.println("The car is small of 2 doors and commonly sport"); ...
            case CONVERTIBLE: {
                System.out.println("The car is sport and convertible of 2 doors");
                break;
            }
            case COUPE: {
                System.out.println("The car is small of 2 doors and commonly sport");
                break;
            }
            case FURGON: {
                System.out.println("The car is utilitarian to transport of companies");
                break;
            }
            case HATCHBACK: {
                System.out.println("The car is mid-compact, sport aspect");
                break;
            }
            case PICKUP: {
                System.out.println("The car is double cabin");
                break;
            }
            case SEDAN: {
                System.out.println("The car is mid-size");
                break;
            }
            case STATION_WAGON: {
                System.out.println("The car is bigger, with a large suitcase");
                break;
            }

        }

        TypeAutomobile[] types = TypeAutomobile.values(); // get all values of Enum TypeAutomobile
        for (TypeAutomobile ta : types) {
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getName() + ", " +
                    ta.getDescription() + ", " +
                    ta.getNumberDoor());
            System.out.println();

        }

    }
}

// We can use switch with Enum and for or foreach
// Use of Enum is similar to classes but all data is constant, we can do days of weeks, solar system. calendar, etc.