import java.util.Scanner;

public class VetorEordenacao {

    public static void preencherVetor(int[] v, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            v[i] = sc.nextInt();
        }
    }

    public static void imprimirVetor(int[] v, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void ordenar(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirMaiorImpar(int[] v, int n) {
        int maiorImpar = -1;
        boolean encontrouImpar = false;

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0) {
                if (!encontrouImpar || v[i] > maiorImpar) {
                    maiorImpar = v[i];
                    encontrouImpar = true;
                }
            }
        }

        if (encontrouImpar) {
            System.out.println("Maior número ímpar: " + maiorImpar);
        } else {
            System.out.println("Não há números ímpares no vetor");
        }
    }

    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
        int indicePares = 0;
        int indiceImpares = 0;

        for (int i = 0; i < n; i++) {
            pares[i] = -1;
            impares[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                pares[indicePares++] = v[i];
            } else {
                impares[indiceImpares++] = v[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        int[] pares = new int[n];
        int[] impares = new int[n];

        preencherVetor(vetor, n);
        System.out.print("Vetor original: ");
        imprimirVetor(vetor, n);

        ordenar(vetor, n);
        System.out.print("Vetor ordenado: ");
        imprimirVetor(vetor, n);

        imprimirMaiorImpar(vetor, n);

        criarParesImpares(vetor, n, pares, impares);
        System.out.print("Vetor de pares: ");
        imprimirVetor(pares, n);
        System.out.print("Vetor de ímpares: ");
        imprimirVetor(impares, n);
    }
}
