import java.util.Scanner;

public class Exemplo3 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite seu peso em números inteiros (EX: 78 ou 85) -> ");
        double peso = s.nextDouble();

        System.out.print("Digite sua altura em números fracionados (EX: 1,78) -> ");
        double altura = s.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é -> " + imc);

        if (imc < 16) {
            System.out.println("Magreza grave (palito)");
        } else if (imc < 17) { 
            System.out.println("Magreza moderada (palito de churrasco)");
        } else if (imc < 18.5) { 
            System.out.println("Magreza leve (mosca)");
        } else if (imc < 25) { 
            System.out.println("Peso normal (humano)");
        } else if (imc < 30) { 
            System.out.println("Sobrepeso (pneu)");
        } else if (imc < 35) { 
            System.out.println("Obesidade grau I (borracharia)");
        } else if (imc < 40) { 
            System.out.println("Obesidade grau II (concessionária)");
        } else {
            System.out.println("Obesidade grau III (Thais Carla)");
        }
    }
}
