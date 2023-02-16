package _G_ValueVsReference;

// Reference is similar when we pass values in parameters

class Person { // it must create a class in another file, but in this case only as an example
    private String name;
    public void modifyingName(String newName) {
        name = newName;
    }
    public String readingName() {
        return this.name;
    }
}

public class C_PassingByReference2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.modifyingName("Andrés");

        System.out.println("Start main method");

        System.out.println("person.name = " + person.readingName());
        System.out.println("Before calling test method");
        test(person);
        System.out.println("After calling test method");

        System.out.println("person.name = " + person.readingName());

        System.out.println("Finish the main method with array data modified!");
    }

    public static void test(Person person) {
        System.out.println("Start test method");
        person.modifyingName("Pepe");
//        System.out.println(person.readingName());
        System.out.println("Finish test method");
    }
}

