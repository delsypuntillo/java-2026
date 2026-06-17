package Bucles;

public class EercicoSuma {
    public static void main(String[] args) {
        int  total =0 ;
        for (int valorInicial =1 ; valorInicial<= 100; valorInicial++){
            total = total + valorInicial;
            System.out.println("valorInicial: "+ valorInicial);
        }

        System.out.println("EL TOTAL ES:" + total);


    }
}
