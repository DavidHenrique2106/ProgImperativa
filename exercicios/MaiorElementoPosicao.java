package exercicios;

import java.util.Scanner;

public class MaiorElementoPosicao {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior = Integer.MIN_VALUE;
        int posicao = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição: " + posicao);
    }
}
