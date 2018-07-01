package EstructuraDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaContactos {
    public static void main(String[] args) {
        //se pide crear una lista de contactos, para lo cual permita  preguntar al usuario cuantos contactos desea agregar
        //y segun eso añadir y mostar los contactos
        Scanner entradaDatos = new Scanner(System.in);
        List<String> contactos = new ArrayList<>();
        int cantidadContactos;
        System.out.println("ingrese cuantos contactos desea ingresar");
        cantidadContactos = entradaDatos.nextInt();
        entradaDatos.nextLine();
        for (int iterador = 0; iterador < cantidadContactos; iterador++){
            System.out.println("ingrese el  contacto:" + (iterador+1));
            String contacto= entradaDatos.nextLine();
            contactos.add(contacto);

        }
        System.out.println("mostrar contactos");
        for (int iterador = 0; iterador < contactos.size(); iterador++){
            System.out.println("el contacto "+ (iterador + 1)+ " es "+ contactos.get(iterador));

        }
        System.out.println("busqueda de contactos");
        System.out.println("ingrese el contacto a buscar");
        String nombreContacto = entradaDatos.nextLine().toLowerCase();
        if (contactos.contains(nombreContacto)) {
            System.out.println("el nombre" + nombreContacto + " si existe ");

        }else{
            System.out.println("el nombre" + nombreContacto +   " no existe ");
        }


        entradaDatos.close();

    }
}
