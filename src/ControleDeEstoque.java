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
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MENU DE GERENCIAMENTO DE ESTOQUE ---");
            System.out.println("[1] Venda");
            System.out.println("[2] Reposição");
            System.out.println("[3] Relatório");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        // LÓGICA DE VENDA
                        System.out.println("\n--- REALIZAR VENDA ---");
                        System.out.println("Qual produto deseja vender?");
                        System.out.println("[1] " + nomeProduto1);
                        System.out.println("[2] " + nomeProduto2);
                        System.out.println("[3] " + nomeProduto3);
                        System.out.print("Escolha o produto: ");
                        int produtoVenda = scanner.nextInt();

                        System.out.print("Qual a quantidade a ser vendida (em kg)? ");
                        int quantidadeVenda = scanner.nextInt();

                        switch (produtoVenda) {
                            case 1:
                                if (quantidadeVenda > 0 && quantidadeVenda <= quantidadeProduto1) {
                                    quantidadeProduto1 -= quantidadeVenda;
                                    System.out.println("\n✅ Venda de " + quantidadeVenda + " kg de " + nomeProduto1 + " realizada com sucesso!");
                                } else {
                                    System.out.println("\n❌ Erro: Estoque insuficiente ou quantidade inválida! Quantidade disponível: " + quantidadeProduto1 + " kg.");
                                }
                                break;
                            case 2:
                                if (quantidadeVenda > 0 && quantidadeVenda <= quantidadeProduto2) {
                                    quantidadeProduto2 -= quantidadeVenda;
                                    System.out.println("\n✅ Venda de " + quantidadeVenda + " kg de " + nomeProduto2 + " realizada com sucesso!");
                                } else {
                                    System.out.println("\n❌ Erro: Estoque insuficiente ou quantidade inválida! Quantidade disponível: " + quantidadeProduto2 + " kg.");
                                }
                                break;
                            case 3:
                                if (quantidadeVenda > 0 && quantidadeVenda <= quantidadeProduto3) {
                                    quantidadeProduto3 -= quantidadeVenda;
                                    System.out.println("\n✅ Venda de " + quantidadeVenda + " kg de " + nomeProduto3 + " realizada com sucesso!");
                                } else {
                                    System.out.println("\n❌ Erro: Estoque insuficiente ou quantidade inválida! Quantidade disponível: " + quantidadeProduto3 + " kg.");
                                }
                                break;
                            default:
                                System.out.println("\n❌ Opção de produto inválida!");
                        }
                        break;
                    case 2:
                        // --- INÍCIO DA LÓGICA DE REPOSIÇÃO ---
                        System.out.println("\n--- REALIZAR REPOSIÇÃO ---");
                        System.out.println("Qual produto deseja repor?");
                        System.out.println("[1] " + nomeProduto1);
                        System.out.println("[2] " + nomeProduto2);
                        System.out.println("[3] " + nomeProduto3);
                        System.out.print("Escolha o produto: ");
                        int produtoReposicao = scanner.nextInt();

                        System.out.print("Qual a quantidade a ser adicionada (em kg)? ");
                        int quantidadeReposicao = scanner.nextInt();

                        // Verifica qual produto foi escolhido e processa a reposição
                        if (quantidadeReposicao > 0) {
                            switch (produtoReposicao) {
                                case 1: // Reposição de Tomates
                                    quantidadeProduto1 += quantidadeReposicao; // Adiciona ao estoque
                                    System.out.println("\n✅ Reposição de " + quantidadeReposicao + " kg de " + nomeProduto1 + " realizada com sucesso! Novo estoque: " + quantidadeProduto1 + " kg.");
                                    break;
                                case 2: // Reposição de Batatas
                                    quantidadeProduto2 += quantidadeReposicao; // Adiciona ao estoque
                                    System.out.println("\n✅ Reposição de " + quantidadeReposicao + " kg de " + nomeProduto2 + " realizada com sucesso! Novo estoque: " + quantidadeProduto2 + " kg.");
                                    break;
                                case 3: // Reposição de Cebolas
                                    quantidadeProduto3 += quantidadeReposicao; // Adiciona ao estoque
                                    System.out.println("\n✅ Reposição de " + quantidadeReposicao + " kg de " + nomeProduto3 + " realizada com sucesso! Novo estoque: " + quantidadeProduto3 + " kg.");
                                    break;
                                default:
                                    System.out.println("\n❌ Opção de produto inválida!");
                            }
                        } else {
                            System.out.println("\n❌ Erro: A quantidade para reposição deve ser maior que zero.");
                        }
                        // --- FIM DA LÓGICA DE REPOSIÇÃO ---
                        break;
                    case 3:
                        System.out.println("\n--- OPÇÃO SELECIONADA: [3] RELATÓRIO ---");
                        System.out.println("Produto: " + nomeProduto1 + " | Preço: R$" + precoProduto1 + " | Estoque: " + quantidadeProduto1 + " kg");
                        System.out.println("Produto: " + nomeProduto2 + " | Preço: R$" + precoProduto2 + " | Estoque: " + quantidadeProduto2 + " kg");
                        System.out.println("Produto: " + nomeProduto3 + " | Preço: R$" + precoProduto3 + " | Estoque: " + quantidadeProduto3 + " kg");
                        break;
                    case 4:
                        System.out.println("\nSaindo do sistema... Até logo!");
                        break;
                    default:
                        System.out.println("\n❌ Opção inválida! Por favor, escolha um número entre 1 e 4.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\n❌ Erro: Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito
                opcao = 0;
            }
        }
        scanner.close();
    }
}