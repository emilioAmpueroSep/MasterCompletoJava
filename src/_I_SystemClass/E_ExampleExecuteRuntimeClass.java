package _I_SystemClass;

public class E_ExampleExecuteRuntimeClass {
    public static void main(String[] args) {
//        This exercise serve to run applications installed in OS :

/*
       - exec() is deprecated since Java 18, this it would be the new form:

        String[] comandos = {"notepad"};

        if (System.getProperty("os.name").startsWith("Windows")) {

            proceso = rt.exec(comandos);

        }
*/

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            // Windows OS:
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } // Mac Os:
            else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");
            } // Linux Os:
            else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            } // Linux Gnome environment:
            else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor(); // wait hen the process is open then to close, follow to System.out.println("Se ha cerrado el editor");
        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
