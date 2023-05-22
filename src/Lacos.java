public class Lacos {
    public static void main(String[] args) {
        System.out.println("Estruturas de repetiçoes");
        System.out.println("");
        System.out.println("Exemplo 5 - Uso do 'for'");
        for (int i = 10; i > 0; i--) {
            System.out.println("hello! " + i);
        }

        System.out.println("");
        System.out.println("Exemplo 6 - Tabuada");
        for (int tabuada = 0; tabuada <= 10; tabuada++) {
            System.out.println("");
            for (int valor = 0; valor <= 10; valor++) {
                System.out.println(tabuada + " X " + valor + " = " + tabuada*valor);
            }
        }

        System.out.println("");
        System.out.println("Exemplo  - Uso da estrutura while");
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("");
        System.out.println("Exemplo  - Uso da estrutura do while");
        char novoJogo;
        do {
            System.out.println("Deseja jogar novamente?");
            novoJogo = 'n';

        } while (novoJogo == 's');
        System.out.println("GAME OVER");

    }
}
