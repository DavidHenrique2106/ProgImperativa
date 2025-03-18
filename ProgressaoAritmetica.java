import java.util.Scanner;

public class ProgressaoAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial da progressão: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Informe o fator de incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("Informe a quantidade de termos da progressão: ");
        int quantidadeTermos = scanner.nextInt();

        System.out.println("A progressão aritmética é:");
        for (int i = 0; i < quantidadeTermos; i++) {
            System.out.print(valorInicial + (i * incremento));
            if (i < quantidadeTermos - 1) {
                System.out.print(", ");
            }
        }

    }
}
