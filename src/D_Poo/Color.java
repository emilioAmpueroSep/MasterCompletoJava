package D_Poo;

public enum Color { // collection of attributes constant type
    RED("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    WHITE("White"),
    GREY("Dark grey"),
    ORANGE("Orange");

    private final String color; // it must be declared type final the var always in terms of use enums

    // constructor:
    Color(String color) {
        this.color = color;
    }

    // getter:
    public String getColor() {
        return color;
    }

    // if I do this, by default it gonna take values passed by parameters,it is not necessary to add .getColor() like a method
    @Override
    public String toString() {
        return this.color;
    }
}
