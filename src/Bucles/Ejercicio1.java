package Bucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        String nombreUsuario = "";
        String clave = "";

        while(nombreUsuario == "juan" || clave == "12345"){
            System.out.println("ingrese su nombre de usuario");
            nombreUsuario = entradaDatos.nextLine();

            System.out.println("ingrese su clave");
            clave = entradaDatos.nextLine();
            if (nombreUsuario == "juan" || clave == "12345"){
                System.out.println("datos incorrectos");

            }
            }
        System.out.println("bienvenido al sistema");
       }
    }
