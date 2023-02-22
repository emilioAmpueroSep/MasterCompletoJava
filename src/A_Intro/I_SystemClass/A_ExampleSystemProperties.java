package A_Intro.I_SystemClass;

import java.util.Properties;

public class A_ExampleSystemProperties {
    public static void main(String[] args) {
        //    The system class cannot be instantiated or inherited (static)

//      username of my OS:
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

//      route where is located my username:
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

//      route where is located workspace:
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

//      shows version of Java in OS:
        String java = System.getProperty("java.version");
        System.out.println("home = " + java);

//      separator of line (similar to \n ) (there's 2 ways):
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator:" + lineSeparator + "A new line...");

        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2:" + lineSeparator2 + "A new line2...");

//      shows all properties of System class:
        Properties p = System.getProperties();
        p.list(System.out);

//        https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

    }
}
