package exercicios;

import java.util.Scanner;

public class ValorDaHora {
    public static void main(String[] args) {
        float remuneracao, cargaHoraria, custoOperacional, hora;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a remuneração mensal: R$ ");
        remuneracao = sc.nextFloat();
        System.out.println("Digite a carga horaria mensal em horas: ");
        cargaHoraria = sc.nextFloat();
        

        sc.close();
    }
    
}
