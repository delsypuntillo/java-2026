package Selectivas;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese el producto pagado efectivo o tarjeta");
        double costo = entradaDatos.nextDouble();

        if (costo > 200){
            System.out.println("pago en efectivo");
        }else {
            System.out.println("pago en tarjeta");
        }



    }
}
