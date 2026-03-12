package funcoes.entidades;

public class Exercicio00
{
    public void mensagem()
    {
        System.out.println("IFTO - Colinas");
    }
    
    public float maiorDeDois(float n1, float n2) {
        if (n1 >= n2) {
            return n1;
        } else {
            return n2;
        }
    }

    // Exercício 127 - Conversão de Fahrenheit para Celsius
    public double conversaoTemperaturas(double F) {
        double celsius;
        celsius = (F - 32) * (5.0 / 9.0);
        return celsius;
    }

    // Exercício 128 - Volume do Cilindro
    public double volumeCilindro(double raio, double altura) {
        double pi = 3.1414592;
        double volume = pi * Math.pow(raio, 2) * altura;
        return volume;
    }

    // Exercício 129 - Volume da Esfera
    public double volumeEsfera(double raio) {
        double pi = 3.1414592;
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        return volume;
    }

    // Exercício 130 - Índice de Massa Corporal (IMC)
    public double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }
    
    // Método adicional para o Exercício 130 - Mostrar classificação do IMC
    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obeso Leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obeso Moderado";
        } else {
            return "Obeso Mórbido";
        }
    }
}