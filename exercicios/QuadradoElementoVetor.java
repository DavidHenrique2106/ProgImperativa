package exercicios;

import java.util.Scanner;

public class QuadradoElementoVetor {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double[] quadrados = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextDouble();
            quadrados[i] = numeros[i] * numeros[i];
        }

        System.out.println("Números originais:");
        for (double n : numeros) {
            System.out.println(n);
        }

        System.out.println("Quadrados:");
        for (double q : quadrados) {
            System.out.println(q);
        }

    }

}
