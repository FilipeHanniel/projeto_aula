package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        int opcao;   //Opção do jogo.
        String nome; //Nome do jogador.
        Scanner sc = new Scanner(System.in);
        String sair;

        System.out.println("\n\n_________JokenPô_________\n\n\n");
        System.out.print("Digite seu nome: ");
        nome = sc.next();

        // *** LIMPAR A TELA ***

        
        
        do {
            System.out.printf("\n\n\n\n\n%s escolha uma das opções abaixo:\n", nome);
        
            System.out.println("1. PEDRA");
            System.out.println("2. PAPEL");
            System.out.println("3. TESOURA\n\n");
        
            do {
                System.out.print("Digite a opção desejada: ");
                opcao = sc.nextInt();
                if (opcao != 1 && opcao != 2 && opcao != 3) {
                    System.out.println("Opção Inválida!");
                }
            } while (opcao != 1 && opcao != 2 && opcao != 3);

            
            System.out.println("\n\nPENSANDO...\n\n\n");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("got interrupted!");
            }

            Random aleatorio = new Random();
            int computador = aleatorio.nextInt(4);

            // JOGO:
            if (opcao == 1 && computador == 1) {
                System.out.println("JOGADOR: PEDRA");
                System.out.println("COMPUTADOR: PEDRA");
                System.out.println(" -- EMPATE -- ");
            } else if (opcao == 1 && computador == 2) {
                System.out.println("JOGADOR: PEDRA");
                System.out.println("COMPUTADOR: PAPEL");
                System.out.print(" -- O COMPUTADOR VENCEU --");
            } else if (opcao == 1 && computador == 3) {
                System.out.println("JOGADOR: PEDRA");
                System.out.println("COMPUTADOR: TESOURA");
                System.out.printf("  -- JOGADOR %s VENCEU ", nome);
            } else if (opcao == 2 && computador == 2) {
                System.out.println("JOGADOR: PAPEL");
                System.out.println("COMPUTADOR: PAPEL");
                System.out.println(" -- EMPATE -- ");
            } else if (opcao == 2 && computador == 1) {
                System.out.println("JOGADOR: PAPEL");
                System.out.println("COMPUTADOR: PEDRA");
                System.out.printf("  -- JOGADOR %s VENCEU ", nome);
            } else if (opcao == 2 && computador == 3) {
                System.out.println("JOGADOR: PAPEL");
                System.out.println("COMPUTADOR: TESOURA");
                System.out.printf(" -- O COMPUTADOR VENCEU --");
            } else if (opcao == 3 && computador == 1) {
                System.out.println("JOGADOR: TESOURA");
                System.out.println("COMPUTADOR: PEDRA");
                System.out.print(" -- O COMPUTADOR VENCEU --");
            } else if (opcao == 3 && computador == 2) {
                System.out.println("JOGADOR: TESOURA");
                System.out.println("COMPUTADOR: PAPEL");
                System.out.printf("  -- JOGADOR %s VENCEU ", nome);
            } else {
                System.out.println("JOGADOR: TESOURA");
                System.out.println("COMPUTADOR: TESOURA");
                System.out.println(" -- EMPATE -- ");
            }
        
            do {
                System.out.print("\n\nDeseja jogar novamente? (s/n)");
                sair = sc.next();
                if ((sair.equals("s")) | (sair.equals("S")) | (sair.equals("n")) | (sair.equals("N"))) {
                    break;
                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println(sair);
                    System.out.println((sair.equals("s")));
                }
            } while ((!sair.equals("s")) | (!sair.equals("S")) | (!sair.equals("n")) | (!sair.equals("N")));
        
            
    } while ((sair.equals("s")) || (sair.equals("S")));
    sc.close();
    System.out.println("GAME OVER");
    }
    
}
