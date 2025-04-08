import java.util.Random;

public class TabelaFrequenciaContador {
    public static void main(String[] args) {
        int[] numeros = new int[200];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(20) + 1;
        }

        System.out.println("Valor | Frequência");
        for (int valor = 1; valor <= 20; valor++) {
            int contador = 0;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == valor) {
                    contador++;
                }
            }

            System.out.printf("  %2d   |   %d\n", valor, contador);
        }
    }
}
