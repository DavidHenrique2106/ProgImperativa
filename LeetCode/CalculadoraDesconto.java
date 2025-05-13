import java.util.Scanner;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a categoria do produto (1, 2 ou 3): ");
        int categoria = scanner.nextInt();

        if (categoria < 1 || categoria > 3) {
            System.out.println("Categoria inválida. Tente novamente.");
            scanner.close();
            return;
        }

        System.out.print("Informe o preço do produto: R$ ");
        double precoProduto = scanner.nextDouble();

        if (precoProduto <= 0) {
            System.out.println("Preço inválido. Tente novamente.");
            scanner.close();
            return;
        }

        System.out.print("Informe a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. Tente novamente.");
            scanner.close();
            return;
        }

        double novoPreco = calcularNovoPreco(categoria, precoProduto, quantidade);
        double totalCompra = novoPreco * quantidade;
        double economia = (precoProduto * quantidade) - totalCompra;

        System.out.printf("Novo preço por unidade: R$ %.2f\n", novoPreco);
        System.out.printf("Valor total da compra: R$ %.2f\n", totalCompra);
        System.out.printf("Você economizou: R$ %.2f\n", economia);

        scanner.close();
    }

    public static double calcularNovoPreco(int categoria, double precoProduto, int quantidade) {
        double descontoCategoria = 0.0;

        switch (categoria) {
            case 1:
                descontoCategoria = 0.10;
                break;
            case 2:
                descontoCategoria = 0.15;
                break;
            case 3:
                descontoCategoria = 0.08;
                break;
            default:
                break;
        }

        double descontoQuantidade = 0.0;

        if (quantidade <= 2) {
            descontoQuantidade = 0.02;
        } else if (quantidade <= 10) {
            descontoQuantidade = 0.05;
        } else {
            descontoQuantidade = 0.10;
        }

        double descontoTotal = descontoCategoria + descontoQuantidade;
        return precoProduto * (1 - descontoTotal);
    }
}
