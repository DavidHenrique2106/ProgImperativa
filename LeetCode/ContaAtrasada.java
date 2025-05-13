import java.util.Scanner;

public class ContaAtrasada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da conta: R$ ");
        double valorConta = scanner.nextDouble();
        
        System.out.print("Digite o valor da multa (em %): ");
        double multaPercentual = scanner.nextDouble();
        
        System.out.print("Digite o valor dos juros mensais (em %): ");
        double jurosPercentual = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de dias em atraso: ");
        int diasAtraso = scanner.nextInt();
        
        double valorFinal = calcularValorAtraso(valorConta, multaPercentual, jurosPercentual, diasAtraso);
        
        if (valorFinal == -1) {
            System.out.println("A conta está com mais de 45 dias de atraso. Não é possível calcular.");
        } else {
            System.out.printf("O valor final da conta é: R$ %.2f\n", valorFinal);
        }
        
        scanner.close();
    }

    public static double calcularValorAtraso(double valorConta, double multaPercentual, double jurosPercentual, int diasAtraso) {
        if (diasAtraso > 45) {
            return -1; 
        }
        
        double multa = valorConta * (multaPercentual / 100);
        
        double jurosProporcionais = valorConta * (jurosPercentual / 100) * (diasAtraso / 30.0);
        
        return valorConta + multa + jurosProporcionais;
    }
}
