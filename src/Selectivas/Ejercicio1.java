package Selectivas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese usuario:");
        String usuario = entradaDatos.nextLine();
        System.out.println("ingrese contraseña:");
        String clave = entradaDatos.nextLine();
        String usuarioSistema = "delsy";
        String  claveSistema = "123456";

         if (usuario.equalsIgnoreCase(usuarioSistema)){
             System.out.println("usuario correcto");

             if (clave.equalsIgnoreCase(claveSistema)){
                 System.out.println("clave correcto");

             }else {
                 System.out.println("clave incorrecto");

             }
         }else{
        System.out.println("usuario incorrecto");
    }
    }
}