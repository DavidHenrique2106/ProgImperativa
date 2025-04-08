package exercicios;

import java.util.Scanner;

public class SomaXeY {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o índice X: ");
        int x = sc.nextInt();
        System.out.print("Digite o índice Y: ");
        int y = sc.nextInt();

        int soma = vetor[x] + vetor[y];
        System.out.println("Soma de vetor[" + x + "] + vetor[" + y + "] = " + soma);

    }
}
