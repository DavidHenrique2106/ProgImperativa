package aluno;

import java.util.Scanner;

public class ProgramaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        String[] matriculas = new String[10];
        double[] medias = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine().trim();

            System.out.println("Digite a matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = scanner.nextLine().trim();

            System.out.println("Digite a média final do aluno " + (i + 1) + ": ");
            try {
                medias[i] = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Média inválida. Digite um número. Repetindo...");
                i--; 
            }
        }

        System.out.println("\n--- Alunos Aprovados ---");
        for (int i = 0; i < 10; i++) {
            if (medias[i] >= 6.0) {
                System.out.println("Nome: " + nomes[i] + ", Matrícula: " + matriculas[i] + ", Média Final: " + medias[i]);
            }
        }

        System.out.println("\n--- Alunos Reprovados ---");
        for (int i = 0; i < 10; i++) {
            if (medias[i] < 6.0) {
                System.out.println("Nome: " + nomes[i] + ", Matrícula: " + matriculas[i] + ", Média Final: " + medias[i]);
            }
        }

        scanner.close();
    }
}
