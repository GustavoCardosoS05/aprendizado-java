package estudo.segundasemana;

public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "Gustavo" + "Cardoso";

        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        int numero = 5;
        numero = -numero; // tornei meu numero negativo dessa maneira
        System.out.println(numero);

        numero = numero * -1; // nesse caso, estamos tornando um numero negativo em positivo
        System.out.println(numero);

        // numero++ é uma maneira de fazer uma atribuição mais simples

        boolean bool = true;
        System.out.println(!bool);
        bool = !bool;

        int a, b;

        a = 5;
        b = 6;

//        if (a == b)
//            System.out.println("verdadeiro");
//        else
//            System.out.println("falso");


        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

    }
}
