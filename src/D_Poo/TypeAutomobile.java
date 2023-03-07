package D_Poo;

public enum TypeAutomobile {
    SEDAN("Sedan", "mid-size", 4),
    STATION_WAGON("Station Wagon", "big-size", 5),
    HATCHBACK("Hatchback", "compact", 5),
    PICKUP("Pickup", "van", 4),
    COUPE("Coupe", "small-size", 2),
    CONVERTIBLE("Convertible", "sport", 2),
    FURGON("Furgon", "utilitarian", 3),
    SUV("SUV", "All-Terrain sport",5);

    private static int sport;
    private final String name;
    private final int numberDoor;
    private final String description;

    TypeAutomobile(String name, String description, int numberDoor) {
        this.name = name;
        this.numberDoor = numberDoor;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public String getDescription() {
        return description;
    }
}
