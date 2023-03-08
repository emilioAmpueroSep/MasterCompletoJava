package com.eampuero.aintro.cstringtypestrings;

public class C_StringExampleImmutable {
    public static void main(String[] args) {

        // immutable = its status or value never it changes; its created another instance.
        String course = "Java Programming";
        String teacher = "Andres Guzman";

        String result = course.concat(teacher);
        System.out.println("course = " + course);
        System.out.println("result = " + result);
        System.out.println(course == result);

        // Lambdas:
        String result2 = course.transform(c ->{
                return c + " with " + teacher;
        });
        System.out.println("course = " + course);
        System.out.println("result2 = " + result2);

        String result3 = result.replace("a","A");

        System.out.println("result = " + result);
        System.out.println("result3 = " + result3);
    }
}
