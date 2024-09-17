import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valor = 0;
        int somaTotal = 0;
        while(valor != 99){
           /* System.out.println(valor);
            valor++;*/

            Scanner sc = new Scanner(System.in);

            System.out.println("Informe o valor: ");
            System.out.println("Informe 99 para sair");
            valor = sc.nextInt();

            somaTotal += valor;

        }
        System.out.println("Total é: " + somaTotal);
    }
}