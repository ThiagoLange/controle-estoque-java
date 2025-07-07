import java.util.Scanner;

public class ControleDeEstoque {

    public static void main(String[] args) {
        // --- PRODUTO 1: TOMATES ---
        String nomeProduto1 = "Tomates";
        double precoProduto1 = 8.99;
        int quantidadeProduto1 = 100;

        // --- PRODUTO 2: BATATAS ---
        String nomeProduto2 = "Batatas";
        double precoProduto2 = 4.50;
        int quantidadeProduto2 = 250;

        // --- PRODUTO 3: CEBOLAS ---
        String nomeProduto3 = "Cebolas";
        double precoProduto3 = 5.25;
        int quantidadeProduto3 = 180;

        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; // Variável para armazenar a opção do usuário

        // Laço 'while' para manter o menu ativo até que o usuário escolha a opção 4
        while (opcao != 4) {
            System.out.println("\n--- MENU DE GERENCIAMENTO DE ESTOQUE ---");
            System.out.println("[1] Venda");
            System.out.println("[2] Reposição");
            System.out.println("[3] Relatório");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");

            // Tratamento de exceção para garantir que o usuário digite um número
            try {
                opcao = scanner.nextInt();

                // Estrutura 'switch' para lidar com a opção escolhida
                switch (opcao) {
                    case 1:
                        System.out.println("\n--- OPÇÃO SELECIONADA: [1] VENDA ---");
                        // Aqui será desenvolvida a lógica de venda
                        break;
                    case 2:
                        System.out.println("\n--- OPÇÃO SELECIONADA: [2] REPOSIÇÃO ---");
                        // Aqui será desenvolvida a lógica de reposição de estoque
                        break;
                    case 3:
                        System.out.println("\n--- OPÇÃO SELECIONADA: [3] RELATÓRIO ---");
                        System.out.println("Produto: " + nomeProduto1 + " | Preço: R$" + precoProduto1 + " | Quantidade: " + quantidadeProduto1 + " kg");
                        System.out.println("Produto: " + nomeProduto2 + " | Preço: R$" + precoProduto2 + " | Quantidade: " + quantidadeProduto2 + " kg");
                        System.out.println("Produto: " + nomeProduto3 + " | Preço: R$" + precoProduto3 + " | Quantidade: " + quantidadeProduto3 + " kg");
                        break;
                    case 4:
                        System.out.println("\nSaindo do sistema... Até logo!");
                        break; // Encerra o switch e o laço 'while'
                    default:
                        System.out.println("\nOpção inválida! Por favor, escolha um número entre 1 e 4.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito
                opcao = 0; // Reseta a opção para manter o loop
            }
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}