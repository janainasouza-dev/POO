package funcoes.entidades;
import java.util.Scanner;

public class Exercicio00
{
    public  void mensagem ()
    {
        System.out.println("IFTO - Colinas");

    }
    public float maiorDeDois(float n1 , float n2){
        if(n1>=n2)
        {
            return n1;
        }else
            return n2;
    }

    //Relativo ao exercicio 127

    public double conversaoTemperaturas(double F){
        System.out.println("Conversor de temperaturas");
        double celsius;
        celsius = (F - 32) * (5.0/9.0);
        return celsius;
    }

}


