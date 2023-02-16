package _F_WrapperClasses;

public class B_AutoBoxingInteger {
    public static void main(String[] args) {
//      - autoboxing or boxing: it is used for change a variable primitive to wrapper.
//      - unboxing: it is used for change a variable wrapper to primitive.

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // implicit
//      Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // explicit

//       Explicit form:(unboxing)
        int sum = 0;

        for (Integer i: enteros) {
            if (i.intValue() % 2 == 0) {
                sum += i.intValue();
            }
        }
        System.out.println("sum = " + sum);

//      Implicit form:(autoboxing or boxing)
        sum = 0;

        for (Integer i: enteros) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
