package _G_ValueVsReference;

// Reference is similar when we pass values in parameters
// in this case, arrays can be change its values
public class B_PassingByReference {
    public static void main(String[] args) {
        int[] age = {10, 11, 12};

        System.out.println("Start main method");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }

        System.out.println("Before calling test method");
        test(age);
        System.out.println("After calling test method");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Finish the main method with array data modified!");
    }
        public static void test(int[] ageArr) {
            System.out.println("Start test method");
            for (int i = 0; i < ageArr.length; i++) {
                System.out.println("ageArr[i] = " + ageArr[i]);
                ageArr[i] = ageArr[i] + 20;
            }
            System.out.println("Finish the test method");
        }
}

