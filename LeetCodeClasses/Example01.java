import java.util.Scanner;

public class Example01 {

    public static Scanner input = new Scanner(System.in);

    public static void lerPessoa(Pessoa p) {
        System.out.print("Digite o nome -> ");
        p.nome = input.nextLine();

        System.out.print("Digite a idade -> ");
        p.idade = Integer.parseInt(input.nextLine());

        System.out.print("Digite o peso -> ");
        p.peso = Double.parseDouble(input.nextLine());

        System.out.print("Digite a altura -> ");
        p.altura = Double.parseDouble(input.nextLine());
    }

    public static void imprimirPessoa(Pessoa p) {
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Peso: " + p.peso + " kg");
        System.out.println("Altura: " + p.altura + " m");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(), p2 = new Pessoa();

        System.out.println("-------- Digitação pessoa 01 --------");
        lerPessoa(p1);

        System.out.println("-------- Digitação pessoa 02 --------");
        lerPessoa(p2);

        System.out.println("\n--- Dados inseridos ---");
        imprimirPessoa(p1);
        imprimirPessoa(p2);
    }
}


