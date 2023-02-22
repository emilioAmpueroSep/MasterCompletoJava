package A_Intro.E_ControlFlows;

public class H_ForEachStatement {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num : numbers) {
            System.out.println("num = " + num);
        }

        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
