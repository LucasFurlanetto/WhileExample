import java.util.Scanner;

public class tcham {
        public static void main(String[] args) {

            int opcao = 0;
            Scanner tantofaz = new Scanner(System.in);

            do {
                System.out.println("** Escolha **");
                System.out.println("1 - Inserir ");
                System.out.println("2 - Excluir ");
                System.out.println("3 - Alterar ");
                System.out.println("4 - Sair ");
                opcao = tantofaz.nextInt();
            }while(opcao != 0);

        }
}