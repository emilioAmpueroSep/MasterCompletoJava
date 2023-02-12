package _E_ControlFlows;

public class I_LoopTagsStatement {
    public static void main(String[] args) {

        // tags in loops to continue and break are used for accomplish its function in loops assigneds.
        // It can be used in all type of control forms

        loop1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue loop1;
                }
                System.out.print("[i = " + i + ", j + " + j + "], ");
            }
        }

        System.out.println("\n\n======================================================");

        loop2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break loop2;
                }
                System.out.print("[i = " + i + ", j + " + j + "], ");
            }
        }

        System.out.println("\n\n======================================================");

        loop3:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue loop3;
                }
                System.out.println("Día " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }

    }
}
