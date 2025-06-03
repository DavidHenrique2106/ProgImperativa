import java.util.Scanner;

public class Example02 {
    public static final int TAM = 2;
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

    public static int buscarPessoaMaisAlta(Pessoa[] v) {
        int indiceMaisAlto = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i].altura > v[indiceMaisAlto].altura) {
                indiceMaisAlto = i;
            }
        }

        return indiceMaisAlto;
    }

public static double buscarMediaIdades(Pessoa[] v) {
    int soma = 0;

    for (int i = 0; i < v.length; i++) {
        soma += v[i].idade;
    }

    return (double) soma / v.length;
}


    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[TAM];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("-------- Digitação pessoa " + (i + 1) + " --------");
            pessoas[i] = new Pessoa();
            lerPessoa(pessoas[i]);
        }

        System.out.println("\n--- Dados inseridos ---");
        for (Pessoa pessoa : pessoas) {
            imprimirPessoa(pessoa);
        }

        int indice = buscarPessoaMaisAlta(pessoas);
        System.out.println("Pessoa mais alta:");
        imprimirPessoa(pessoas[indice]);

        double media = buscarMediaIdades(pessoas);
        System.out.println("Média das idades: " + media);

    }
}
