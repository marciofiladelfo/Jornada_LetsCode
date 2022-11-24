package main.estoque;

import main.entities.Produtos;

import java.util.List;

public interface TipoProdutosEstoque {
    void somaLivros(List<Produtos> list);
    void somaBrinquedos(List<Produtos> list);
    void somaFilmes(List<Produtos> list);
    void somaJogos(List<Produtos> list);
    void somaMusicas(List<Produtos> list);

    void buscarLivros(List<Produtos> list);
    void buscarBrinquedos(List<Produtos> list);
    void buscarFilmes(List<Produtos> list);
    void buscarJogos(List<Produtos> list);
    void buscarMusicas(List<Produtos> list);
}
