package Selectivas;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner entraDatos = new Scanner(System.in);
        System.out.println("ingrese el monto de la compra");
        double montoCompra = entraDatos.nextDouble();
        System.out.println("tienes una membresia? si o no");
        String membresia = entraDatos.nextLine().toLowerCase();
        if (montoCompra >= 500){
            if (membresia.equalsIgnoreCase("si")){
                System.out.println("tu descuento es el 20 %");
                double descuento = montoCompra +1.20;
                descuento = montoCompra-descuento;
            }else {
                double descuento = montoCompra +1.10;
                descuento = montoCompra-descuento;
                System.out.println("tu descuento es el 10%"+ descuento);

            }

        }else {
            System.out.println("no tiene descuento");
        }
















    }
}
