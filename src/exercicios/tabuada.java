

package exercicios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada: ");
        valor = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(valor + " X " + i + " = " + valor*i );
        }

        sc.close();
    }
}
