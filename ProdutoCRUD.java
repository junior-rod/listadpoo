package listaspoo.listad;

import java.util.ArrayList;
import java.util.List;

public class ProdutoCRUD {

	private static List<Produto> produtos = new ArrayList<>();

	public static void criarProduto(Produto produto) {
		for (Produto p : produtos) {
			if (p.getId() == produto.getId()) {
				System.out.println("Erro: Já existe um produto com o ID " + produto.getId());
				return;
			}
		}
		produtos.add(produto);
		System.out.println("Produto adicionado: " + produto);
	}

	public static void lerProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto disponível.");
		} else {
			System.out.println("Lista de Produtos:");
			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		}
	}

	public static void atualizarProduto(int id, String novoNome, double novoPreco) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				produto.setNome(novoNome);
				produto.setPreco(novoPreco);
				System.out.println("Produto atualizado: " + produto);
				return;
			}
		}
		System.out.println("Produto com ID " + id + " não encontrado.");
	}

	public static void deletarProduto(int id) {
		Produto removerProduto = null;
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				removerProduto = produto;
				break;
			}
		}
		if (removerProduto != null) {
			produtos.remove(removerProduto);
			System.out.println("Produto removido: " + removerProduto);
		} else {
			System.out.println("Produto com ID " + id + " não encontrado.");
		}
	}
}
