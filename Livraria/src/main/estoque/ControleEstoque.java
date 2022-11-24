package main.estoque;

import main.entities.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static main.estoque.TiposProdutos.*;

public class ControleEstoque implements TipoProdutosEstoque {
    private final AtomicInteger count = new AtomicInteger();

    @Override
    public void somaLivros(List<Produtos> list) {
        list.forEach(x -> {
            if (x.toString().contains(LIVROS.getDescricao())) {
                count.getAndIncrement();
            }
        });
        System.out.println("Total de Livros: " + count);
        count.set(0);
    }

    @Override
    public void somaBrinquedos(List<Produtos> list) {
        list.forEach(x -> {
            if (x.toString().contains(BRINQUEDOS.getDescricao())) {
                count.getAndIncrement();
            }
        });
        System.out.println("Total de Brinquedos: " + count);
        count.set(0);
    }

    @Override
    public void somaFilmes(List<Produtos> list) {
        list.forEach(x -> {
            if (x.toString().contains(FILMES.getDescricao())) {
                count.getAndIncrement();
            }
        });
        System.out.println("Total de Filmes: " + count);
        count.set(0);
    }

    @Override
    public void somaJogos(List<Produtos> list) {
        list.forEach(x -> {
            if (x.toString().contains(JOGOS.getDescricao())) {
                count.getAndIncrement();
            }
        });
        System.out.println("Total de Jogos: " + count);
        count.set(0);
    }

    @Override
    public void somaMusicas(List<Produtos> list) {
        list.forEach(x -> {
            if (x.toString().contains(MUSICAS.getDescricao())) {
                count.getAndIncrement();
            }
        });
        System.out.println("Total de Musicas: " + count);
        count.set(0);
    }

    @Override
    public void buscarLivros(List<Produtos> list) {
        List<Produtos> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if (x.toString().contains(LIVROS.getDescricao())) {
                listTiposEspecificos.add(x);
            }
        });
        System.out.println("Estoque de livros: " + listTiposEspecificos);
    }

    @Override
    public void buscarBrinquedos(List<Produtos> list) {
        List<Produtos> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if (x.toString().contains(BRINQUEDOS.getDescricao())) {
                listTiposEspecificos.add(x);
            }
        });
        System.out.println("Estoque de brinquedos: " + listTiposEspecificos);
    }

    @Override
    public void buscarFilmes(List<Produtos> list) {
        List<Produtos> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if (x.toString().contains(FILMES.getDescricao())) {
                listTiposEspecificos.add(x);
            }
        });
        System.out.println("Estoque de filmes: " + listTiposEspecificos);
    }

    @Override
    public void buscarJogos(List<Produtos> list) {
        List<Produtos> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if (x.toString().contains(JOGOS.getDescricao())) {
                listTiposEspecificos.add(x);
            }
        });
        System.out.println("Estoque de jogos: " + listTiposEspecificos);
    }

    @Override
    public void buscarMusicas(List<Produtos> list) {
        List<Produtos> listTiposEspecificos = new ArrayList<>();
        list.forEach(x -> {
            if (x.toString().contains(MUSICAS.getDescricao())) {
                listTiposEspecificos.add(x);
            }
        });
        System.out.println("Estoque de musicas: " + listTiposEspecificos);
    }
}
