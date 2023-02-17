package _I_SystemClass;

import java.util.Map;

public class C_ExampleEnvironmentVariables {
    public static void main(String[] args) {
//      The system class cannot be instantiated or inherited (static)

//      It shows all Variables of the system environment (my computer):
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables of the system environment = " + varEnv);

//      Iterating Map<> with a foreach to show all Variables of the system environment:
        System.out.println("---------Listing system environment variables---------");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH"); // or Path
        System.out.println("path = " + path);

//      It can get of Map<> varEnv created here
        String path2 = varEnv.get("Path"); // here it only accepts Path not PATH
        System.out.println("path2 = " + path2);

//      It can get a created variable in my computer here, (it must restart my text editor)
        String laar = varEnv.get("LAAR");
        System.out.println("laar = " + laar);

//      I can create in command line a var environment : setx LAAR2 "write here that i want it"
//      (it must restart my text editor)
        String laar2 = varEnv.get("LAAR2");
        System.out.println("laar2 = " + laar2);
    }
}
