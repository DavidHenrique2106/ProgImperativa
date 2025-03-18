import java.util.Scanner;

public class Exemplo6 {
   public static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {

        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + " -> ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double mediaTurma = soma / notas.length;

        System.out.println("\nMédia da turma -> " + mediaTurma);
        System.out.println("\nAlunos acima da média:");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mediaTurma) {
                System.out.println("Aluno " + (i + 1) + " com nota " + notas[i]);
            }
        }

        System.out.println("\nAlunos abaixo da média:");
        for (int i = 0; i < notas.length; i++){
            if (notas[i] < mediaTurma){
                System.out.println("Aluno " + (i + 1) + " com nota " + notas[i]);
            }
        }
    }
}
