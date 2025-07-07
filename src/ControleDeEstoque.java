public class ControleDeEstoque {

    public static void main(String[] args) {
        // --- PRODUTO 1: TOMATES ---

        // Variável para o nome do produto
        String nomeProduto1 = "Tomates";

        // Variável para o preço por quilo (utilizando 'double' para valores decimais)
        double precoProduto1 = 8.99;

        // Variável para a quantidade em estoque (utilizando 'int' para números inteiros)
        int quantidadeProduto1 = 100; // Ex: 100 quilos


        // --- PRODUTO 2: BATATAS ---

        // Variável para o nome do produto
        String nomeProduto2 = "Batatas";

        // Variável para o preço por quilo
        double precoProduto2 = 4.50;

        // Variável para a quantidade em estoque
        int quantidadeProduto2 = 250; // Ex: 250 quilos


        // --- PRODUTO 3: CEBOLAS ---

        // Variável para o nome do produto
        String nomeProduto3 = "Cebolas";

        // Variável para o preço por quilo
        double precoProduto3 = 5.25;

        // Variável para a quantidade em estoque
        int quantidadeProduto3 = 180; // Ex: 180 quilos


        // Exemplo de como exibir as informações no console
        System.out.println("--- ESTOQUE ATUAL ---");
        System.out.println("Produto: " + nomeProduto1 + " | Preço: R$" + precoProduto1 + " | Quantidade: " + quantidadeProduto1 + " kg");
        System.out.println("Produto: " + nomeProduto2 + " | Preço: R$" + precoProduto2 + " | Quantidade: " + quantidadeProduto2 + " kg");
        System.out.println("Produto: " + nomeProduto3 + " | Preço: R$" + precoProduto3 + " | Quantidade: " + quantidadeProduto3 + " kg");
    }
}