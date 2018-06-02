package Selectivas;

import java.util.Scanner;

public class Anidadas {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int calificacion = entradaDatos.nextInt();
        System.out.println("ingrese una calificacion.2");
        int calificaciones = entradaDatos.nextInt();



        if (calificacion >= 13){
            System.out.println("has aprobado");
            if (calificacion >= 15){
                System.out.println("obtuviste una buena calificacion");

            }
        }else {
            System.out.println("has reprobado el curso, sigue estudiando");
        }



        entradaDatos.close();
    }
}
