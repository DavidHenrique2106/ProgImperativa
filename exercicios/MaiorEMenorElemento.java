package exercicios;

import java.util.Scanner;

public class MaiorEMenorElemento {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior, menor;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        maior = menor = vetor[0];

        for (int valor : vetor) {
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
