
public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Exemplo 4 - Uso do 'switch case'");
       System.out.println("1. Cadastro de clientes");
       System.out.println("2. Cadastro de usuários");
       System.out.println("3. Relatórios");
       int opcao = 3;
       switch (opcao) {
       case 1:
            System.out.println("CLIENTES");
            break;
        case 2:
            System.out.println("USUÁRIOS");
            break;
        case 3:
            System.out.println("RELATÓRIOS");
            break;
        default:
            System.out.println("Opção inválida!");
            break;

       }

    }
}
