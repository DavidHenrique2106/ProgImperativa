import java.util.Random;

public class VetorAleatorio {

    public static void main(String[] args) {
        int tamanho = 1000;

        int[] vetorBusca = new int[tamanho];
        preencherComBusca(vetorBusca, tamanho);

        int[] vetorShuffle = new int[tamanho];
        preencherComShuffle(vetorShuffle);

        System.out.println("Vetor gerado com verificação (sem repetição):");
        imprimirVetor(vetorBusca);

        System.out.println("\nVetor gerado com embaralhamento:");
        imprimirVetor(vetorShuffle);
    }

    public static int busca(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void preencherComBusca(int[] v, int tamanho) {
        Random rand = new Random();
        int count = 0;

        while (count < tamanho) {
            int numero = rand.nextInt(1000) + 1;
            if (busca(v, count, numero) == -1) {
                v[count] = numero;
                count++;
            }
        }
    }

    public static void preencherComShuffle(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1; 
        }

        Random rand = new Random();
        for (int i = 0; i < v.length; i++) {
            int j = rand.nextInt(v.length);
            // Troca
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println(); 
        }
    }
}
