package funcoes.aplicacao;

import funcoes.entidades.Exercicio00;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Exercicio00 exemplo = new Exercicio00();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--------Sejam bem vindos ao Nosso Curso de POO----------:");
        System.out.println("Qual Função você deseja executar?");
        System.out.println("125 -- 127 -- 128 -- 129 -- 130?");
        
        int escolha;
        escolha = entrada.nextInt();
        
        switch (escolha) {
            case 125 -> {
                System.out.println("Voce Escolheu a Funcao maior de dois numeros!!!");
                System.out.println("Entre com primeiro valor:");
                float n1 = entrada.nextFloat();
                System.out.println("Entre com segundo valor:");
                float n2 = entrada.nextFloat();
                System.out.println("O maior valor eh: " + exemplo.maiorDeDois(n1, n2));
            }

            case 127 -> {
                System.out.println("Voce Escolheu a Funcao para converter Temperaturas!!!");
                System.out.println("Entre com o valor da temperatura em Fahrenheit:");
                double f = entrada.nextDouble();
                System.out.println("O valor em Celsius e: " + exemplo.conversaoTemperaturas(f));
            }

            case 128 -> {
                System.out.println("Voce Escolheu a Funcao para calcular o volume de um cilindro!!!");
                System.out.println("Entre com o valor do raio:");
                double raio = entrada.nextDouble();
                System.out.println("Entre com o valor da altura:");
                double altura = entrada.nextDouble();
                double volume = exemplo.volumeCilindro(raio, altura);
                System.out.printf("O volume do cilindro e: %.2f\n", volume);
            }
            
            case 129 -> {
                System.out.println("Voce Escolheu a Funcao para calcular o volume de uma esfera!!!");
                System.out.println("Entre com o valor do raio:");
                double raio = entrada.nextDouble();
                double volume = exemplo.volumeEsfera(raio);
                System.out.printf("O volume da esfera e: %.2f\n", volume);
            }
            
            case 130 -> {
                System.out.println("Voce Escolheu a Funcao para calcular o IMC (Índice de Massa Corporal)!!!");
                System.out.println("Entre com o peso (em kg):");
                double peso = entrada.nextDouble();
                System.out.println("Entre com a altura (em metros):");
                double altura = entrada.nextDouble();
                
                double imc = exemplo.calcularIMC(peso, altura);
                String classificacao = exemplo.classificarIMC(imc);
                
                System.out.printf("Seu IMC e: %.2f\n", imc);
                System.out.println("Classificacao: " + classificacao);
            }
            
            default -> {
                System.out.println("Digite uma escolha valida");
                System.out.println("125 -- 127 -- 128 -- 129 -- 130?");
            }
        }
        
        entrada.close();
    }
}