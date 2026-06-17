package EstructuraDatos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
      // lista de arreglo - mutables o que puedan ser manipulables al momento de hacer el uso
        /*
        List<TipoDato> nombreLista = new ArrayList<>();

         */
        List<String> frutas = new ArrayList<>();
        frutas.add("piña");
        frutas.add("uva");
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("fresa");
        System.out.println(frutas);
        for ( int iterador = 0; iterador <= frutas.size(); iterador++) {
            System.out.println(frutas.get(iterador));
        }


    }
}
