import java.util.Scanner;

public class ExemploProduto {

    public static Scanner input = new Scanner(System.in);

    public static void lerProduto(Produto p) {
        System.out.print("Digite o título do produto -> ");
        p.titulo = input.nextLine();

        System.out.print("Digite a descrição do produto -> ");
        p.descricao = input.nextLine();

        System.out.print("Digite o preço unitário -> ");
        p.precoUnitario = Double.parseDouble(input.nextLine());

        System.out.print("Digite a quantidade em estoque -> ");
        p.qtdEstoque = Integer.parseInt(input.nextLine());
    }

    public static void imprimirProduto(Produto p) {
        System.out.println("Título: " + p.titulo);
        System.out.println("Descrição: " + p.descricao);
        System.out.println("Preço Unitário: R$ " + p.precoUnitario);
        System.out.println("Quantidade em Estoque: " + p.qtdEstoque);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Produto prod1 = new Produto(), prod2 = new Produto();

        System.out.println("-------- Digitação produto 01 --------");
        lerProduto(prod1);

        System.out.println("-------- Digitação produto 02 --------");
        lerProduto(prod2);

        System.out.println("\n--- Produtos Cadastrados ---");
        imprimirProduto(prod1);
        imprimirProduto(prod2);
    }
}
