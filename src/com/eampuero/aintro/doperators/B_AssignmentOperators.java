package com.eampuero.aintro.doperators;

public class B_AssignmentOperators {
    public static void main(String[] args) {

        // assignment operators
        int i = 5;
        int j = i + 4;


        //combined operators
        i += 2; //  i = i + 2;  the same
        i += 5;
        System.out.println("i = " + i);

        j -= 4; //  j = j - 4;  the same
        System.out.println("j = " + j);

        j *= 4; // j = j * 4;  the same
        System.out.println("j = " + j);


        // to do a sql query
        String sqlString = "select * from clientes as c ";
        sqlString += "where c.nombre = 'Andres' ";
        sqlString += "and c.activo = 1;";
        System.out.println("sqlString = " + sqlString);

    }
}
