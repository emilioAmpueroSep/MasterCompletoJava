package B_Arrays;

public class F_ExampleArrayOrderStartEnd {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // initialize array reserving 10 spaces
        int[] a = new int[10]; // initialize array reserving 10 spaces
        int total = numbers.length;

        for (int i = 0; i < total; i++) { // iterate array number
            numbers[i] = i + 1;
        }


        int aux = 0;
//        for (int i = 0; i < total/2; i++) { // both cases are the same:
        for (int i = 0; i < total - i; i++) {
            a[aux++] = numbers[i]; // fill the position in array a
            a[aux++] = numbers[(total - 1) - i]; // fill the next position in array a
//            System.out.print(numbers[i] + " ");
//            System.out.println(numbers[(total - 1) -i]);
        }

        for (int i = 0; i < a.length; i++) { // iterate array a
            System.out.println("i = " + i + " value: " + a[i]);
        }
    }
}
