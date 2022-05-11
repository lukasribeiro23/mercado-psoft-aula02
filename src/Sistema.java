import exemplo.Lote;
import exemplo.Produto;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Produto produto1 = new Produto("Farinha", "Melita");
		Produto produto2 = new Produto("Chocolate", "Nestle");
		ProdutoRepositorio catalogo = new ProdutoRepositorio();
		catalogo.addProduto(produto);
		catalogo.addProduto(produto1);
		catalogo.addProduto(produto2);
		Lote lote = new Lote(produto, 10L);
		
		System.out.println(produto);
		System.out.println(lote);
	}
}
