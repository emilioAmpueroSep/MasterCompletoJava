package com.eampuero.aintro.isystemclass;

import java.io.FileInputStream;
import java.util.Properties;

public class B_AssignSystemProperties {
    public static void main(String[] args) {
        //    The system class cannot be instantiated or inherited (static)

//        1. create a file called: config.properties with properties we want adding (src/com.eampuero.A_Intro._I_SystemClass/config.properties)

        try {
//          2. adding FileInputStream with the path where is located config.properties
            FileInputStream archivo = new FileInputStream("src/com.eampuero.A_Intro._I_SystemClass/config.properties");

//          3. adding class Properties then we add load method to load the new properties
            Properties p = new Properties(System.getProperties());
            p.load(archivo);

//          It can add another property of this way:
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

//          It shows the new properties:
            Properties pGet = System.getProperties();
            System.out.println("ps.getProperty(...) = " + pGet.getProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.correo"));

            pGet.list(System.out);

        } catch(Exception e){
//          System.err.println... if I have an error ex: src/com.eampuero.A_Intro._I_SystemClass/config2.properties"); it is gonna appear other way of error in console.
            System.err.println("It does not exist = " + e);
            System.exit(1); //to finish to run
        }
    }
}
