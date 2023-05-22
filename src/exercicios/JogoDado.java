package exercicios;

import java.util.Scanner;

public class JogoDado {
    public static void main(String[] args) {
        char opcao = 's';
        Scanner sc = new Scanner(System.in);

        while ((opcao == 's') | (opcao == 'S')) {
            System.out.println("Lançamento do DADO........\n");
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face: " + dado);
            System.out.println("\nDeseja lançar novamente? (s/n)");
            opcao = sc.next().charAt(0);
        }

        sc.close();

    }
    
}
