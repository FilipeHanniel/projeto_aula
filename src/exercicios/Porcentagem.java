package exercicios;

import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args) {
        float valor;
        float porcent;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor total: ");
        valor = entrada.nextFloat();

        System.out.println("Digite a porcentagem % ");
        porcent = entrada.nextFloat();

        float resultado = (valor * (porcent/100));

        System.out.printf("%.1f porcento de %.1f é: ", porcent, valor);
        System.out.printf("%.1f", resultado);

        entrada.close();
    }
    
}
