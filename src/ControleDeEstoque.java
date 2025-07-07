import java.util.Scanner;
import java.text.DecimalFormat; // Importa a classe para formatar números

public class ControleDeEstoque {

    public static void main(String[] args) {
        // --- PRODUTOS ---
        String nomeProduto1 = "Tomates";
        double precoProduto1 = 8.99;
        int quantidadeProduto1 = 100;

        String nomeProduto2 = "Batatas";
        double precoProduto2 = 4.50;
        int quantidadeProduto2 = 250;

        String nomeProduto3 = "Cebolas";
        double precoProduto3 = 5.25;
        int quantidadeProduto3 = 180;

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // Formatação para exibir valores monetários com duas casas decimais
        DecimalFormat df = new DecimalFormat("#,##0.00");

        while (opcao != 4) {
            System.out.println("\n--- MENU DE GERENCIAMENTO DE ESTOQUE ---");
            System.out.println("[1] Venda");
            System.out.println("[2] Reposição");
            System.out.println("[3] Relatório Financeiro");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        // Lógica de Venda
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
                        // Lógica de Reposição
                        System.out.println("\n--- REALIZAR REPOSIÇÃO ---");
                        System.out.println("Qual produto deseja repor?");
                        System.out.println("[1] " + nomeProduto1);
                        System.out.println("[2] " + nomeProduto2);
                        System.out.println("[3] " + nomeProduto3);
                        System.out.print("Escolha o produto: ");
                        int produtoReposicao = scanner.nextInt();

                        System.out.print("Qual a quantidade a ser adicionada (em kg)? ");
                        int quantidadeReposicao = scanner.nextInt();

                        if (quantidadeReposicao > 0) {
                            switch (produtoReposicao) {
                                case 1:
                                    quantidadeProduto1 += quantidadeReposicao;
                                    System.out.println("\n✅ Reposição de " + quantidadeReposicao + " kg de " + nomeProduto1 + " realizada com sucesso! Novo estoque: " + quantidadeProduto1 + " kg.");
                                    break;
                                case 2:
                                    quantidadeProduto2 += quantidadeReposicao;
                                    System.out.println("\n✅ Reposição de " + quantidadeReposicao + " kg de " + nomeProduto2 + " realizada com sucesso! Novo estoque: " + quantidadeProduto2 + " kg.");
                                    break;
                                case 3:
                                    quantidadeProduto3 += quantidadeReposicao;
                                    System.out.println("\n✅ Reposição de " + quantidadeReposicao + " kg de " + nomeProduto3 + " realizada com sucesso! Novo estoque: " + quantidadeProduto3 + " kg.");
                                    break;
                                default:
                                    System.out.println("\n❌ Opção de produto inválida!");
                            }
                        } else {
                            System.out.println("\n❌ Erro: A quantidade para reposição deve ser maior que zero.");
                        }
                        break;
                    case 3:
                        // --- INÍCIO DA LÓGICA DO RELATÓRIO FINANCEIRO ---
                        System.out.println("\n--- RELATÓRIO FINANCEIRO DE ESTOQUE ---");

                        // Calcula o valor total para cada produto
                        double valorTotalProduto1 = quantidadeProduto1 * precoProduto1;
                        double valorTotalProduto2 = quantidadeProduto2 * precoProduto2;
                        double valorTotalProduto3 = quantidadeProduto3 * precoProduto3;

                        // Calcula o valor total de todos os produtos somados
                        double valorTotalEstoque = valorTotalProduto1 + valorTotalProduto2 + valorTotalProduto3;

                        // Exibe as informações detalhadas de cada produto
                        System.out.println("-------------------------------------------");
                        System.out.println("Produto: \t\t" + nomeProduto1);
                        System.out.println("Quantidade em Estoque: \t" + quantidadeProduto1 + " kg");
                        System.out.println("Valor Unitário: \t\tR$ " + df.format(precoProduto1));
                        System.out.println("Valor Total do Produto: \tR$ " + df.format(valorTotalProduto1));
                        System.out.println("-------------------------------------------");
                        System.out.println("Produto: \t\t" + nomeProduto2);
                        System.out.println("Quantidade em Estoque: \t" + quantidadeProduto2 + " kg");
                        System.out.println("Valor Unitário: \t\tR$ " + df.format(precoProduto2));
                        System.out.println("Valor Total do Produto: \tR$ " + df.format(valorTotalProduto2));
                        System.out.println("-------------------------------------------");
                        System.out.println("Produto: \t\t" + nomeProduto3);
                        System.out.println("Quantidade em Estoque: \t" + quantidadeProduto3 + " kg");
                        System.out.println("Valor Unitário: \t\tR$ " + df.format(precoProduto3));
                        System.out.println("Valor Total do Produto: \tR$ " + df.format(valorTotalProduto3));
                        System.out.println("===========================================");

                        // Exibe o valor total do estoque
                        System.out.println("VALOR TOTAL DO ESTOQUE: \t\tR$ " + df.format(valorTotalEstoque));
                        System.out.println("===========================================");
                        // --- FIM DA LÓGICA DO RELATÓRIO ---
                        break;
                    case 4:
                        System.out.println("\nSaindo do sistema... Até logo!");
                        break;
                    default:
                        System.out.println("\n❌ Opção inválida! Por favor, escolha um número entre 1 e 4.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\n❌ Erro: Entrada inválida. Por favor, digite um número.");
                scanner.next();
                opcao = 0;
            }
        }
        scanner.close();
    }
}