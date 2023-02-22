package A_Intro.E_ControlFlows;

public class J_LoopTagsSearchStatement {
    public static void main(String[] args) {

//        String phrase = "Tres tristes tigres tragan trigo en un trigal";
//        int max = phrase.length();
//        int amount = 0;
//        char letter = 'g';
//        for (int i = 0; i < max; i++) {
//            if (phrase.charAt(i) != letter) {
//                continue;
//            }
//            amount++;
//        }
//        System.out.println("Found = " + amount + " times the character '"+ letter + "' in the phrase");


        String phrase = "tres tristes tigres tragan trigo en un trigal";
        String word = "trigo";

        int maxWord = word.length();
        int maxPhrase = phrase.length() - maxWord;

        int amount = 0;
        search: // tag of for father
        for (int i = 0; i <= maxPhrase; ) {
            int k = i;
            for (int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue search;
                }
            }
            amount++;
            i = i + maxWord;
        }
        System.out.println("Found = " + amount + " times the word '" + word + "' in the phrase");
    }
}