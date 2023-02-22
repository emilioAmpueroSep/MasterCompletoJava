package A_Intro.J_MathClass;

import java.util.Random;

public class B_ExampleMathClassRandom {
    public static void main(String[] args) {
        
/*
//      Form 1:

        double random = Math.random();// result of numbers never are gonna pass to 1
        System.out.println("random = " + random);
        random *= 7; // to pass to 0 - 7

        System.out.println("random = " + random);

        random = Math.floor(random); // round the number
        System.out.println("random = " + random);
*/


        String[] colors = {"red","blue","green","pink","violet","brown"};

        /*
        double randomColor = Math.random();
        System.out.println("randomColor = " + randomColor);
        randomColor *= colors.length;

        System.out.println("randomColor = " + randomColor);

        randomColor = Math.floor(randomColor); // round to floor because if use ceil, i could have anm error passing to 6, where array begin in 0 til 5
        System.out.println("randomColor = " + randomColor);

        System.out.println("colors = " + colors[(int) randomColor]); // casting double to int
*/

        //      Form 2:

        Random randomObj = new Random();
//        int randomInt = randomObj.nextInt(); // it shows numbers inside 32 bytes (negatives and positives)
//        long randomLong = 15 + randomObj.nextLong(); // it shows numbers inside 64 bytes (negatives and positives)
//        int randomInt = randomObj.nextInt(7); // it shows number since 0 til 6 (its does not show number 7 in this case)
//        int randomInt = 15 + randomObj.nextInt(25-15+1); // it shows number since 15 til 24 (its does not show number 25 in this case)
        int randomInt = 15 + randomObj.nextInt(25-15+1); // if I sum 1, is gonna show 25
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colors.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colors = " + colors[randomInt]);

        // mathRandom, use the class random to work
    }
}
