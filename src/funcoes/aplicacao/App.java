package funcoes.aplicacao;
import funcoes.entidades.Exercicio00;
import java.util.Scanner;



public class App
{
    static void main()
    {



        /*float valor1 = entrada.nextFloat();
        System.out.println("Entre com o segundo valor: ");
        float valor2 = entrada.nextFloat();
        exemplo.maiorDeDois(valor1, valor2);
        float resultado = exemplo.maiorDeDois(valor1, valor2);
        System.out.println("O maior dos dois eh:" + resultado);
        */
        //referentes ao exercicio 127



        Exercicio00 exemplo = new Exercicio00();
        Scanner entrada = new Scanner(System.in);
        // exemplo.mensagem();
        System.out.println("Entre com o valor e, Fahrenheit: ");
        double f = entrada.nextDouble();
        double resultado = exemplo.conversaoTemperaturas(f);
        System.out.println("O valor em celsius:" + resultado);

    }

}



