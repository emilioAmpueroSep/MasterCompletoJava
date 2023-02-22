package A_Intro.E_ControlFlows;

import javax.swing.*;

public class F_ForArrayStatement {
    public static void main(String[] args) {
//        String[] names = new String[8];
//        String names[] = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato" ,"Pepa"};
        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato" ,"Pepa"}; // good practice

        int count = names.length; // good practice
        for (int i = 0; i < count; i++) { // <= error : <= count-1 // it works
            // One way to omit some values:
            if (names[i].toLowerCase().equals("Andres".toLowerCase()) ||
                    names[i].toLowerCase().equals("Pepa".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".-" + names[i]);
        }

        String search = JOptionPane.showInputDialog("Enter a name, example \"Pepe\" or \"Maria\":");
        System.out.println("search = " + search);

        boolean found = false;
        for(int i = 0; i < count; i++){
            if(names[i].equalsIgnoreCase(search)){
                found = true;
                break;
            }
            System.out.println("names = " + names[i]);
        }
        if(found){ // it only accepts booleans.
            JOptionPane.showMessageDialog(null, search + " It was found!");
        } else {
            JOptionPane.showMessageDialog(null, search + " It doesn't exist in the system!");
        }
    }
}
