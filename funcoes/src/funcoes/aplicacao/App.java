package funcoes.aplicacao;
import funcoes.entidades.Exercicio00;
import java.util.Scanner;



public class App
{
    static void main()
    {

    Exercicio00 exemplo = new Exercicio00();
    Scanner entrada = new Scanner(System.in);
    System.out.println("--------Sejam bem vindos ao Nosso Curso de POO----------:");
    System.out.println("Qual Função você deseja executar?");
    System.out.println("125 -- 127 -- 128 -- 129 --130?");
    int escolha;
    escolha = entrada.nextInt();
    switch (escolha){
        
    case 125 -> {
        System.out.println("Voce Escolheu a Funcao maior de dois numeros!!!");
        System.out.println("Entre com primeiro valor:");
        float n1 = entrada.nextFloat();
        float n2 = entrada.nextFloat();
        System.out.println("O maior valor eh: "+exemplo.maiorDeDois(n1,n2));
            }

    case 127 -> {
        System.out.println("Voce Escolher a Funcao para converter Temperaturas!!!");
        System.out.println("Entre com o valor da temperatura em Fahrenheit:");
        double f = entrada.nextDouble();
        System.out.println("O valor em Celsius e: "+exemplo.conversaoTemperaturas(f));
            }

    case 128 -> System.out.println("Voce Escolher a Funcao para calcular o volume de um cilindro!!!");
            // código

    case 129 -> System.out.println("Voce Escolher a Funcao para calcular o volume de uma esfera!!!");
            // código
    case 130 -> // código
    System.out.println("Voce Escolher a Funcao para calcular Calcule e retorne o IM (Índice de Massa Corporal!!!");
    default -> {
        System.out.println("Digite uma escolha valida");
        System.out.println("125 -- 127 -- 128 -- 129 --130?");
            }
    }

    }

}


