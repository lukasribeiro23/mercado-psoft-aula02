// AULA 03 - 1º: implementar (listar produtos pelo seu respectivo nome) - na classe ProdutoRepositorio
// **melhor implementação:

// public List<Produto> getProdsByName(String nome)
//      List<produto>prods = new ArrayList<produto>(); 
//      foreach(Produto p: mapa.values())
//          if (p.getNome().contains(nome))
//              prods.add(p);
//      return(prods);

// novo tipo de classe: "Service" 
// - ProdutoService
// LoteRepo loterepo;
// ProdRep prodRep;
// listarProdsLote();
// List<Produto> listarProdsLote(String nome)
//      List<Lote> lotes= loteRep.getAll();
//      List<Produto> prods= getProdsFromLotes(lotes);
//      List<Produto> paralote= getProdsByName(nome, prods);

// List<Produto> listforProdByName(String nome)
//      List<prod> prods = prodRep.getAll();
//      List<Produto> prodok = getProdsByName(name, prods);