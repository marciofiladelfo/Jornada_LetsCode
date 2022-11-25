package main.estoque;

import main.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ControleEstoque implements TipoProdutosEstoque {
    private final AtomicInteger count = new AtomicInteger();
    private List<Produtos> listTiposEspecificos = new ArrayList<>();

    @Override
    public void somaLivros(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Livros)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Livros: " + count);
        clearVariables();
    }

    @Override
    public void somaBrinquedos(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Brinquedos)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Brinquedos: " + count);
        clearVariables();
    }

    @Override
    public void somaFilmes(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Filmes)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Filmes: " + count);
        clearVariables();
    }

    @Override
    public void somaJogos(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Jogos)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Jogos: " + count);
        clearVariables();
    }

    @Override
    public void somaMusicas(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Musicas)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Musicas: " + count);
        clearVariables();
    }

    @Override
    public void buscarLivros(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Livros).collect(Collectors.toList());
        System.out.println("Estoque de livros: " + listTiposEspecificos);
        clearVariables();
    }

    @Override
    public void buscarBrinquedos(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Brinquedos).collect(Collectors.toList());
        System.out.println("Estoque de brinquedos: " + listTiposEspecificos);
        clearVariables();
    }

    @Override
    public void buscarFilmes(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Filmes).collect(Collectors.toList());
        System.out.println("Estoque de filmes: " + listTiposEspecificos);
        clearVariables();
    }

    @Override
    public void buscarJogos(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Jogos).collect(Collectors.toList());
        System.out.println("Estoque de jogos: " + listTiposEspecificos);
        clearVariables();
    }

    @Override
    public void buscarMusicas(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Musicas).collect(Collectors.toList());
        System.out.println("Estoque de musicas: " + listTiposEspecificos);
        clearVariables();
    }

    private void clearVariables(){
        count.set(0);
        listTiposEspecificos = new ArrayList<>();
    }
}
