package A_Intro.E_ControlFlows;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class N_MenuOpcionesIteratiivo {
    public static void main(String[] args) {
        /*
Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.
Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.

O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces graficas de la siguiente forma:

int opcionIndice = 0;
...

// los Map (o mapas) los veremos mas adelante en el curso en profundidad
// pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
// también se les conoce como diccionarios para almacenar datos en base a un nombre.
Map<String, Integer> opciones = new HashMap();
opciones.put("Actualizar", 1);
opciones.put("Eliminar", 2);
opciones.put("Agregar", 3);
opciones.put("Listar", 4);
opciones.put("Salir", 5);

Object[] opArreglo = opciones.keySet().toArray();

Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                     "Mantenedor de Productos",
                     JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

if (opcion == null) {
    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
} else {
    opcionIndice = opciones.get(opcion.toString());

   // aca un if o switch para las distintas opciones.
}*/
        int opcionIndice = 0;

        do {


            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                // aca un if o switch para las distintas opciones.
                switch (opcionIndice){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario se encuentra en el listado correctamente");
                        break;
                }
            }
        }while (opcionIndice != 5);
        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
    }
}
