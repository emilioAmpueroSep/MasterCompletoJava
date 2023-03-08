package com.eampuero.aintro.gvaluevsreference;

public class A_PassingByValue {

//    String, primitives, Number class(Integer, Byte, Short, Long, Double, Float...) are Immutable (not create a new instance)
//    It holds its value
    public static void main(String[] args) {
        Integer i = 10;
//      int i = 10;

        System.out.println("Start the main method with i = " + i);
        test(i);
        System.out.println("Start the main method with i = " + i);
    }

        public static void test(Integer i) {
//    public static void test(int i) {
        System.out.println("Start the main method with i = " + i);
        i = 35;
        System.out.println("Start the main method with i = " + i);
    }
}
