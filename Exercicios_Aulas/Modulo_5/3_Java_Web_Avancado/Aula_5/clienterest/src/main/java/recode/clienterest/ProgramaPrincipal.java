package recode.clienterest;

import recode.clienterest.service.ProdutoService;
import recode.clienterest.data.Produto;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
      // Processando de forma síncrona
      ProdutoService service = new GestorServico("usu2", "1234").createService();
      Produto p1 = new Produto();
      p1.id = 5L;
      p1.nome   = "MANGAXPTO";
      p1.quantidade = 500;
      p1.ativo = true;
      p1.id = service.inserir(p1).execute().body().id;
      p1.quantidade = 800;
      service.alterar(p1).execute();
      for (Produto p : service.obterTodos().execute().body()) {
          System.out.println(p.nome+" ("+p.id+"): "+p.quantidade);
      }
      service.deletar(p1.id).execute();

  }

}
