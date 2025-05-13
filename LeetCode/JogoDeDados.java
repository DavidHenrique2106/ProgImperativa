import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        int vitoriasPessoa1 = 0;
        int vitoriasPessoa2 = 0;

        for (int i = 1; i <= 10; i++) {
            int dadoPessoa1 = random.nextInt(6) + 1;
            int dadoPessoa2 = random.nextInt(6) + 1;
            
            System.out.println("Rodada " + i + ":");
            System.out.println("Pessoa 1 jogou: " + dadoPessoa1);
            System.out.println("Pessoa 2 jogou: " + dadoPessoa2);
            
            if (dadoPessoa1 > dadoPessoa2) {
                System.out.println("Pessoa 1 venceu esta rodada!\n");
                vitoriasPessoa1++;
            } else if (dadoPessoa2 > dadoPessoa1) {
                System.out.println("Pessoa 2 venceu esta rodada!\n");
                vitoriasPessoa2++;
            } else {
                System.out.println("Empate nesta rodada!\n");
            }
        }
        
        System.out.println("===== Resultado Final =====");
        System.out.println("Vitórias da Pessoa 1: " + vitoriasPessoa1);
        System.out.println("Vitórias da Pessoa 2: " + vitoriasPessoa2);
        
        if (vitoriasPessoa1 > vitoriasPessoa2) {
            System.out.println("Pessoa 1 é a grande vencedora!");
        } else if (vitoriasPessoa2 > vitoriasPessoa1) {
            System.out.println("Pessoa 2 é a grande vencedora!");
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}
