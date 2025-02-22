import java.util.Scanner;

public class Exemplo2 {

public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1;
        int num2;

        System.out.print("Digita o numero 1 aq -> ");
        num1 = input.nextInt();
        
        System.out.print("Digita o numero 2 aq -> ");
        num2 = input.nextInt();

        int total = num1 + num2;
        
        System.out.println("Número 1 -> "+ num1);
        System.out.println("Número 2 -> "+ num2);
        System.out.println("Total - > "+ total);

    }
}



