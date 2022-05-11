package exemplo;

import java.util.HashMap;
import java.util.Map; 

public class ProdutoRepositorio {

    Map<String, Produto> catalogo = new HashMap<>();

    public void addProduto(Produto p) {
        String id = p.getId();
        catalogo.put(id, p);
        return id;
    }

    public String listProduto() {
        String lista = catalogo.toString();
        return "";
    }

    public String editProduto(String id){

    } 

    public Produto recuperarProduto(String id){
        if(catalogo.containsKey(id)){
            return catalogo.get(id).toString();
        } else {
            return "Produto Inexistente"
        }
    }

    public String remover(String id){
        catalogo.remove(id);
        return "Produto Removido";
    }
}