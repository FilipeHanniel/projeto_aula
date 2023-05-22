package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {
    
    public static void main(String[] args) {
        //variáveis
        double c,f;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        //entrada
        System.out.println("Conversão de Temperatura");
        System.out.println("Digite a temperatura em fahrenheit: ");
        f = teclado.nextDouble();
        //processamento
        c = (5 * (f - 32)) / 9;
        //saida
        System.out.println("Temperatura em Celcius: " + formatador.format(c) + "°C");
        System.out.printf("Temperatura em Celcius: %.1f°C", c);

        teclado.close();
        
    }
}
