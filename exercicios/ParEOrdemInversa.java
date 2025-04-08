package exercicios;

import java.util.Scanner;

public class ParEOrdemInversa {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Digite um número PAR: ");
            int valor = sc.nextInt();
            if (valor % 2 == 0) {
                vetor[i] = valor;
                i++;
            } else {
                System.out.println("Número não é par, tente novamente.");
            }
        }

        System.out.println("Valores pares na ordem inversa:");
        for (i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }
}
