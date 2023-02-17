package _J_MathClass;

public class A_Example_Math_Class {
    public static void main(String[] args) {
//        -3 and 3 is the same:
        int absolute = Math.abs(-3);
        System.out.println("absoluto = " + absolute);
        absolute = Math.abs(3);
        System.out.println("absoluto = " + absolute);

//        compare values then it shows the max value between both:
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
//        compare values then it shows the min value between both:
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

//        round values up
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
//        round values down
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
//        round values on the middle
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
