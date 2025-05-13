import java.util.Scanner;

public class PesquisaPessoas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas;
        
        System.out.print("Informe o número de pessoas a serem entrevistadas: ");
        quantidadePessoas = scanner.nextInt();

        int totalMulheres = 0;
        int mulheresMenos50kg = 0;
        int homensMenos30 = 0;
        double somaPesoHomensMenos30 = 0;
        double maiorPeso = -1;
        int idadeMaiorPeso = -1;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Informe o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Informe o peso: ");
            double peso = scanner.nextDouble();

            if (peso > maiorPeso) {
                maiorPeso = peso;
                idadeMaiorPeso = idade;
            }

            if (sexo == 'M' || sexo == 'm') {
                if (idade < 30) {
                    homensMenos30++;
                    somaPesoHomensMenos30 += peso;
                }
            }

            if (sexo == 'F' || sexo == 'f') {
                totalMulheres++;
                if (peso < 50) {
                    mulheresMenos50kg++;
                }
            }
        }

        System.out.println("A idade da pessoa mais pesada é: " + idadeMaiorPeso);

        if (homensMenos30 > 0) {
            double mediaPesoHomensMenos30 = somaPesoHomensMenos30 / homensMenos30;
            System.out.printf("A média de peso dos homens com menos de 30 anos é: %.2f kg\n", mediaPesoHomensMenos30);
        } else {
            System.out.println("Não há homens com menos de 30 anos.");
        }

        if (totalMulheres > 0) {
            double percentualMulheresMenos50kg = (double) mulheresMenos50kg / totalMulheres * 100;
            System.out.printf("O percentual de mulheres com menos de 50 kg é: %.2f%%\n", percentualMulheresMenos50kg);
        } else {
            System.out.println("Não há mulheres na pesquisa.");
        }

    }
}
