import java.util.Arrays;

public class VetorExemplo {
    public static void main(String[] args) {
        // Criando um vetor de inteiros com tamanho 5
        int[] numeros = new int[5];

        // Atribuindo valores às posições
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Exibindo os valores do vetor
        System.out.println("Vetor de inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        // Criando e inicializando um vetor diretamente
        int[] numerosDiretos = {5, 10, 15, 20, 25};
        System.out.println("\nVetor inicializado diretamente:");
        for (int num : numerosDiretos) {
            System.out.println(num);
        }

        // Criando um vetor de Strings
        String[] nomes = {"Alice", "Bob", "Carlos"};
        System.out.println("\nVetor de Strings:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Exibindo um vetor com Arrays.toString()
        System.out.println("\nExibindo vetor com Arrays.toString():");
        System.out.println(Arrays.toString(numerosDiretos));

        // Criando e exibindo uma matriz (vetor bidimensional)
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
