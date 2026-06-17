package EstructuraDatos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        // creando mi arreglo de numeros
        /*
        int[]nombreDeLARREGLO = new int[cantidad de elementos];

         */

        int[]numeros = new int[6];
        numeros [0] = 10;
        numeros[1] = 8;
        numeros[2] = 15;
        numeros[3] = 0;
        numeros[4] = 20;
        numeros[5] = 12;

        System.out.println(Arrays.toString(numeros));
        //arreglo con inicializacion
        int[] notas = {10, 18, 13, 20, 16, 18, 14};
        System.out.println(Arrays.toString(notas));
        //arreglo de frutas
        String[] frutas = {"manzana", "uva", "fresa", "platanos", "pera", "pacay"};
        System.out.println(Arrays.toString(frutas));


    }
}
