import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

       Aula 01 - 09/04
            História:
            - Em 1991, a Sun Microsystems financiou uma pesquisa interna
            com o codinome Green. O projeto resultou no desenvolvimento
            de uma linguagem baseada em C e C++ que seu criador, James Gos-
            ling, chamou de Oak em homenagem á um arvore que ficava de fren-
            te com a janela de seu escritório.
            Descobriu-se mais tarde que já existia uma linguagem chamada
            Oak, então a equipe de desenvolvimento ao ir em uma cafeteria
            e ver que ela se chamava Java, decidiu-se que esse seria o nome.

            - Em 1995, a Sun anunciou o Java formalmente em uma conferência
            importante. Normalmente, um evento como esse não teria gerado mui-
            ta atenção. Entretanto, por conta da grande crescente do WWW (World
            Wide Web).

            - Agora o Java é utilizada praticamente em qualquer lugar:
                - Páginas web com conteúdo interativo e dinâmico;
                - Aplicações corporativos de grande porte;
                - Softwares destinados ao consumidor final;
                - Aplicativos para SmartPhones;

        Aula 02 - 10/04
            Introdução a IDEs:
            - Para aumentar nossa produtividade, nós podemos escolher algumas
            ferramentas denominadas de IDE - Integrated Development Environment
            ou Ambiente de Desenvolvimento Integrado. É um software que dispõe
            de recursos que auxiliam muito nosso desenvolvimento como:

                - Aceleração de nossa escrita com Auto-Complete ou IntelliSense
                - Formatação de palavras e blocos de códigos;
                - Análise de erro de sintaxe;
                - Compilação de programa;
                - Depuração (acompanhamento) de execução do programa.

            - Maven: é uma ferramenta de automação de compilação utilizada prima-
            riamente em projetos Java, mas hoje também é utilizada para construir
            e gerenciar projetos escritos em C#, Ruby, Scala e outras linguagens.

            - Alguns atalhos do IntelliJ:
                - 2x shift: realiza uma pesquisa em todos os lugares
                - Ctrl Shift A: Encontra uma ação
                - Alt Enter: Correções rápidas para possíveis erros
                - Shift f2: Navegar entre problemas do código
                - Ctrl E: Mostra os arquivos abertos recentemente
                - Ctrl Alt L: Reformata o arquivo inteiro
                - Ctrl Alt Shift T: Refatora o elemento sobre o cursor
                - Ctrl W: Aumenta ou diminiui o escopo da seleção
                - Ctrl /: Comentta uma linha ou bloco de código
                - Ctrl B: Navegue até a declaração inicial da classe
                - Alt f7: Encontre todos os lugares onde um elemento é usado
                - Alt 1: Focar na janela da ferramenta do Projeto
                - Esc: Focar no editor

              - Java possui 4 plataformas de desenvolvimento sendo elas:
                    - Java SE (Java Platform, Standard Edition)
                    - Java EE (Java Platform, Enterprise Edition)
                    - Java ME (Java Platform, Micro Edition)
                    - Java FX

              1° Questionário abaixo da média:
                 - Qual dos itens citados NÃO é considerada uma IDE para desenvolver aplicações na linguagem Java?
                  Resposta correta - Pycharm

                 - Você disponibilizou uma aplicação compilada para seus clientes, qual componente será
                 necessário estar instalado na máquina do seu cliente?
                 Resposta correta - JRE

                 - Sabemos que uma das plataformas da linguagem Java contém uma biblioteca de componentes visuais,
                 selecione esta plataforma.
                 Resposta correta - Java SE

                 - Qual ferramenta tem o papel de converter o bytecode em um algoritmo que é interpretado pelo sistema
                 operacional?
                 Resposta correta - JVM

                 - Qual a extensão de um arquivo que contém o código fonte da linguagem Java?
                 Resposta correta - .java

                 - Considerando os inúmeros recursos de uma IDE, qual do itens citados não é aplicado como uma funciona-
                 lidade do ambiente de desenvolvimento ?
                 Resposta correta - Integração continua

                 - Após a compilação do código fonte na linguagem, qual a extensão do conteúdo gerado?
                 Resposta correta - .class

                 - Qual plataforma contém recursos para desenvolvimento com recursos como páginas Web?
                 Resposta correta - Java EE



        Aula 03 - 10/04
            Sintaxe básica do Java

                1° - Anatomia da Classe:

                - A escrita de código de um programa é feito atráves da composição de palavras
                pré-definidas pela linguagem com as expressões que utilizamos para determinar
                o nome dos nossos arquivos, classes, atributos e métodos;

                public class 'Nome' {

                Se trata da onde iremos desenvolver nosso código, e lógico que podemos
                ter dentro dela métodos com outros pares de chaves.
                (Importante ressaltar que o nome deve ser o mesmo do arquivo).

               }

               - É necessário estar dentro da pasta SRC e o nome da classe deve conter
               letras maiúsculas edu.cardoso.primeirasemana.MinhaClasse

               - Se tratando de variaveis, quando utilizamos uma variavel com o nome em letras
               maiúsculas, por convenção é entendido que aquela variável se trata de uma 'final'.
               Ou seja, ao colocar o nome em maiúsculo estamos deixando claro que aquela variável
               não pode ser mudada no futuro.

               - Regras de variável:
                    - Deve conter apenas letras, _(underline), $ ou números de 0 a 9
                    - Obrigatoriamente se inicia por uma letra, _ ou $, jamais com um número
                    - Iniciar com uma letra minúscula - considerado boa prática
                    - Não pode conter espaços
                    - Não pode usar palavras-chave da linguagem
                    - E o nome deve ser único no sistema inteiro (escopo)

               - Declarando váriaveis e métodos:
                    Para declarar uma variável: "Tipo" nomeBemDefinido = Atribuição.
                    Ex: int idade = 23; ou String

                    Para declarar métodos: TipoRetorno nomeObjetivoNoInfinitvo (verbal) + Parametro(s).
                    Ex: int somar (int numeroUm, int numero2)

               - Identação:
                    Basicamente identar é um termo utilizado para eescrever o código do programa de
                    forma hierárquica, facilitando assim a visualização e o entendimento do programa.

               - Organizando arquivos:
                    À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em
                    nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização
                    destes arquivos atráves de pacotes(packages).

               - Java Beans:
                    Umas das maiores dificuldades na programação é escrever algoritmos çegíveis a níveis
                    que sejam compreendidos por qualquer pessoa, principalmente você e seu time. Para
                    isso a linguagem Java sugere, atráves de convenções, formas de escrita universal
                    para nossas classes, atributos, métodos, pacotes.

                        Recomendado:
                        - Uma variável deve ser clara, sem abreviações ou definição;
                        - Sempre no singular, exceto quando se referir a um array ou coleção;
                        - Defina um idioma único para suas variáveis.

                        Não recomendado:
                        - Ex.: double salMedio (salarioMedio) = 1500.23 Variável abreviada
                        - Ex.: String emails (se for, apenas um email, mantenha "email") = "aluno@escola.com"
                        - Ex.: String myName = "JOSEPH" - matenha a coerência no idioma

                    Se tratando de métodos, eles deverão ser nomeados como verbos, através de uma mistura de letras
                    minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas
                    em minúsculo, com exceção da primeira letra de cada palavra composta a seguir a partir
                    da segunda palavra.

                    2° Tipos e Variáveis:

                       - Tipos primitivos:
                         - byte => 8 bits => -128 a 127
                         Ex.: byte b = 100;
                         - short => 16 bits => -32768 a 32767
                         Ex.: short s = 10000;
                         - int => 32 bits => -2147483775808 a 2147483775807
                         Ex.: int i = 100000
                         - long => 64 bits => número muito grande
                         Ex.: long l = 100000L
                         - float => 32 bits => precisão simples, e é necessário colocar a letra F no final.
                         Ex.: float f = 10.5F
                         - double => 64 bits => precisão dupla
                         Ex.: double d = 20.5
                         - String => representar palavras e frases e utiliza aspas duplas ""
                         Ex.: String str = "Cardoso"
                         - char => representar apenas um caracter e utiliza aspas simples ''
                         Ex.: char c = 'A'
                         - boolean => true ou false
                         Ex.: boolean bool = true

                         (Na linguagem Java para podermos representar um número milhar, não
                         podemos utilizar ponto (32.767), devemos apenas o número (32767), caso
                         tenha números após a virgula coloque o ponto.

                         Uma variável é uma área da memoria, associada a um nome, que pode arma-
                         zenar valores de um determinado tipo. Um tipo de dado define um conjunto
                         de valores e um conjunto de operações. Java é uma linguagem com rigidez
                         de tipos, diferente de linguagens como JavaScript, onde declarar o tipo
                         o tipo da variavel não é obrigatório.

                         Já as constantes são os valores armazenados em memória que não podem ser
                         modificados depois de declarados. Em java, esses valores são respresenta-
                         dos pela palavra reservada 'final', seguida do tipo.

                         Ex.: final String EU = "Gustavo" - Não é mais possível mudar essa variável.
                         Ex.: final String BR = "Brasil" - Elas são representadas pela CAIXA ALTA.

                    3° Operadores

                          "Operadores são simbolos especiasi que tem um significado próprio para a linguagem e
                           estão associados a determinadas operações."

                          Operador de Atribuição: "="

                          É utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Em
                          Java definimos um tipo, nome e opcionalmente atribuimos um valor à variável através
                          do operador de atribuição.

                          Operadores Aritmétricos: "+, -, *, /"

                          É utilizado para realizar operações matemáticas entre valores númericos, podendo se tor-
                          nar ou não uma expressão mais complexa.

                          Operadores Unários: "(++), (--), (!),"

                          Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam
                          alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e boole-
                          anos.

                          Operadores Ternários: "?:"

                          O operador de condição ternária é uma forma resumida para definir uma condilçao e escolher
                          por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condi-
                          ção IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única li-
                          nha.

                          Operadores Relacionais:
                            Os operadres relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso,
                            mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual,
                            maior ou maior igual ao da direita, retornando um valor booleano como resultado.

                            == Quando desejamos verificar se uma variável é IGUAL A outra
                            != Quando desejamos verficar se uma variável é DIFERENTE da outra
                            >  Quando desejamos verificar se uma variável é MAIOR QUE a outra
                            >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra
                            <  Quando desejamos verificar se variável é MENOR QUE outra
                            <= Quando desejamos verificar se variável é MENOR OU IGUAL a outra

                            É bem interessante usar o "Equals" para a String, é o recomendado;

                          Os operadores lógicos representam o recurso que nos premite criar expressoes lógicas maiores
                          a partir da junção de duas ou mais expressões; Ex.: && ||

                    4° Métodos:

                        Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis
                        de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponiveis de-
                        tro das nossas classes.

                        Alguns critérios de nomeação de métodos:
                        Esses critérios não são obrigatórios, mas é recomendável que seham seguidos, pois essas convenções facilitam
                        a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos
                        o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

                        - Devem ser nomeados como verbo
                        - Seguir o padrão camelCase (Todas as letras minúsculas com a execeção da primeira letra da segunda palavra).

                        Deve também ter como base as seguintes perguntas:

                        - Qual a proposta principal dos métodos? Você deve se perguntar constantemente até compreender a real finalidade
                        do mesmo.
                        - Qual o tipo de retorno esperado após executar os métodos? Você deve analisar se os métodos, serão responsáveis
                         por retonar algum valor ou não.
                        - Quais são os parâmetros serão necessários para execução dos métodos? Os métodos as vezes precisão de argumentos
                        precisão de argumentos como critérios para a execução.
                        - Os métodos possuem o risco de apresentar alguma exceção? Exceções são comuns ma execução de métodos, as vezes é
                        necessário prever e tratar a possível existência de uma execeção.
                        - Qual a visibilidade dos métodos? Será necessário que os métodos sejam visivéis a toda aplciação, somente em mesmo
                        pacotes, através de herança com somente a nível a própria classe.

                        Com relação se os métodos possam apresentar execeção, no código fica da seguinte maneira:
                        Ex.:
                        public double dividir(int dividendo, int divisor) throws Exception {}

                        Esta funcionalidada não pode ser vista por outras classes:
                        private void metodoPrivado(){}

                        Alguns equivocos estruturais
                        public void validar(){
                            esse método deveria retornar algum valor no caso boolean (true or false)
                        }

                        Complemento com video do Youtube:
                            Forma de criar um array no Java:
                                int[] listaDeInteiros: = {1,2,3,4,5,6...}
                            Porém, quando criamos um vetor dessa maneira, estamos fazendo o que esse vetor tenha
                            um tamanho fixo.

               Aula 04 - 16/04

                    Escopo:

                        O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java,
                        o escopop de variavéis vai de acordo com o bloco onde ela foi declarada. A variável é cria-
                        no acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao
                        qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e có-
                        que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

                        Em uma classe, podemos visualizar a diferença de escopos. Os atributos (variavéis) são decla-
                        rados no corpo principal da Classe, sendo portanto, acessíveis por todas os métodos.

                        Caso você declare uma variável DENTRO DE UMA FUNÇÃO, o escopo dessa variável está limitado
                        apenas ao corpo dessa função, ou seja, dentro das chaves de limitam o método.

                        Uma parte fundamental na elaboração de algoritmos simples ou complexas é determinar a loca-
                        lização de códifo em questão. Sem um domínio sobre escopo de códigos seu projeto tende a con-
                        ter falhas estruturais e comprometer a proposta pricipal da aplicação.

                    Palavras reservadas:
                        Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade espe-
                        cífica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos

                        A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos
                        e escritas com letra maiúscula, sendo identificados com uma cor especial pela maioria das IDE's.

                        Lista:
                        - abstract   - assert     - boolean
                        - break      - byte       - case
                        - catch      - char       - class
                        - const      - continue   - default
                        - do         - double     - else
                        - extends    - final      - finally
                        - float      - for        - goto
                        - if         - implements - import
                        - instanceof - int        - interface
                        - long       - native     - new
                        - package    - private    - protected
                        - public     - return     - short
                        - static     - strictfp   - super
                        - switch     - sychronized- this
                        - throw      - throws     - transcient
                        - try        - void       - volatil
                        - while

                        TAGS:
                            Mas e quais informações que obtemos através de classes documentadas na linguagem? Java Docume-
                            tation é composto por tags que representam dados relevantes para a compreensão da proposta de
                            uma classe e os conjuntos de seus métodos e atributos.

                        JavaDoc:
                            JavaDoc é gerador de documentação criado pela Sun Microsystems para documentar a API dos progra-
                            mas em Javam a partir do código-fonte. O resultado é expresso em HTML. É constituido, basicamente-
                            mente, por algumas marcações muitos simples inseridos nos comentários do programa.


                        Argumentos:
                            Quando executamos uma classe que contenha os métodos main, o mesmo permite que passemos uma array []
                            de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes
                            parâmetros.

                            public static void main(String[] args){
                                String nome = args [0];
                                String sobrenome = args [1];
                                int idade = Integer.valueOf(args[2]);
                                double altura = Double.valueOf(args[3]);

                                sout("Ola, me chamo " + nome + " " + sobrenome);
                                sout("Tenho " + idade + " anos ");
                                sout("Minha altura é " + altura + "cm");
                            }


                       Scanner:
                            A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja
                            como vamos mudar o nosso programa para deixar mais intuitivo aos usuários.





        */


    }
}