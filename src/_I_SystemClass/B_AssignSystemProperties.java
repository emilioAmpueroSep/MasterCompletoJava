package _I_SystemClass;

import java.io.FileInputStream;
import java.util.Properties;

public class B_AssignSystemProperties {
    public static void main(String[] args) {

//        1. create a file called: config.properties with properties we want adding
//        2. adding FileInputStream with the path where is located config.properties
//        3. adding class Properties and then we adding load method to load the new properties

        try {
            FileInputStream file = new FileInputStream("src/_I_SystemClass/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(file);
        } catch(Exception e){
            System.out.println("It does not exist = " + e);
        }
    }
}
