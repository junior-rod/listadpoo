package listaspoo.listad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean gerenciamento = true;

		while (gerenciamento) {
			System.out.println("\n--- Gerenciamento de Produtos ---");
			System.out.println("1. Adicionar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Atualizar Produto");
			System.out.println("4. Remover Produto");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			int escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("Digite o ID do produto: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite o nome do produto: ");
				String nome = scanner.nextLine();
				System.out.print("Digite o preço do produto: ");
				double preco = scanner.nextDouble();
				ProdutoCRUD.criarProduto(new Produto(id, nome, preco));
				break;
			case 2:
				ProdutoCRUD.lerProdutos();
				break;
			case 3:
				System.out.print("Digite o ID do produto a ser atualizado: ");
				int atualizarID = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite o novo nome: ");
				String novoNome = scanner.nextLine();
				System.out.print("Digite o novo preço: ");
				double novoPreco = scanner.nextDouble();
				ProdutoCRUD.atualizarProduto(atualizarID, novoNome, novoPreco);
				break;
			case 4:
				System.out.print("Digite o ID do produto a ser removido: ");
				int removerID = scanner.nextInt();
				ProdutoCRUD.deletarProduto(removerID);
				break;
			case 5:
				gerenciamento = false;
				System.out.println("Encerrando o sistema...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		scanner.close();
	}

}
