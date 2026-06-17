package EstructuraDatos;

import java.util.Arrays;

public class EjempliArray {
    public static void main(String[] args) {
        String[] frutas = {"manzana", "uva", "fresa", "platanos", "pera", "pacay"};
        System.out.println(Arrays.toString(frutas));
        for (int iterador = 0; iterador <= frutas.length; iterador++) {
            System.out.println(frutas[iterador]);
        }

    }
}
