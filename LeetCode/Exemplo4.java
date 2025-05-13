import java.util.Scanner;

public class Exemplo4 {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num1;
        int num2;

        System.out.print("Digite o número 1 -> ");
        num1 = s.nextInt();

        System.out.print("Digite o número 2 -> ");
        num2 = s.nextInt();


        while (num1 > num2) {
            System.out.println("O primeiro número é maior");
            System.out.print("Digite um número maior q o primeiro -> ");
            num2 = s.nextInt();
        }
    }
}
