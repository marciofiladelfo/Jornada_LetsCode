package main.estoque;

import main.entities.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface ControleEstoque {
    AtomicInteger count = new AtomicInteger();
    static void somaLivros(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Livros)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Livros: " + count);
        count.set(0);
    }

    static void somaBrinquedos(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Brinquedos)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Brinquedos: " + count);
        count.set(0);
    }

    static void somaFilmes(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Filmes)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Filmes: " + count);
        count.set(0);
    }

    static void somaJogos(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Jogos)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Jogos: " + count);
        count.set(0);
    }
    static void somaMusicas(List<Produtos> list) {
        list.stream().filter(p -> p instanceof Musicas)
                .forEach(x -> count.getAndIncrement());
        System.out.println("Total de Musicas: " + count);
        count.set(0);
    }
}
