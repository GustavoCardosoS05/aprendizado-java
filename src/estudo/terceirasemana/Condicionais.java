package estudo.terceirasemana;

public class Condicionais
{
    public static void main( String[] args )
    {

        /// Condicional Simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;


        if( valorSolicitado > saldo )
        {
            saldo = saldo - valorSolicitado;
            System.out.println( saldo );
        }


        /// Condicional Composta

        int nota1 = 6;

        if( nota1 >= 7 )
        {
            System.out.println( "Aprovado" );
        }
        else if ( nota1 >= 5 && nota1 < 7 )
        {
            System.out.println( "Est� de recupera��o" );
        }
        else
        {
            System.out.println( "Reprovado" );
        }

        ///  Condicioanl Tern�rio

        int nota2 = 7;
        String resultado = nota2 >= 7 ? "Aprovado" : "Reprovado";
        System.out.println( resultado );

        /// Switch-case

        String sigla = "A";
        switch ( sigla )
        {
            case "P":
            {
                System.out.println( "Pequeno" );
                break;
            }
            case "M":
            {
                System.out.println( "M�dio" );
                break;
            }
            case "G":
            {
                System.out.println( "Grande" );
                break;
            }
            default:
                System.out.println( "Indefinido" );
        }


    }

}
