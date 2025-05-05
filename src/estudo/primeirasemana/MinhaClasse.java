package estudo.primeirasemana;

public class MinhaClasse {

    // Caso minha classe é executável, se faz necessário ter um metodo chamado 'Main'

    public static void main(String[] args) {

        // Após utilzar "final" antes da variável garante que ela nunca será mudada e seu nome
        // deve ser totalmente em letras maiúsculas
        final String BR = "Brasil";
        // BR = "Argentina"; Apresentará o seguinte erro: Cannot assign a value to final variable 'BR';

        String primeiroNome = "Gustavo";
        String segundoNome = "Cardoso";
        String terceiroNome = "Sousa";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
    }





}
