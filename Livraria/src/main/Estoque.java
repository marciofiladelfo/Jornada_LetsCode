package main;

import main.entities.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Estoque<T extends Produtos> {

    public static List<Produtos> estoque = new ArrayList<>();

    public static void adicionar(Produtos t) {
        if (!estoque.contains(t)) {
            estoque.add(t);
        }
    }

    public static List<Produtos> getEstoque() {
        return estoque;
    }

    public static void apagar(Produtos t) {
        if (!vetorVazio()) {
            for (int i = 0; i < estoque.size(); i++) {
                if (estoque.get(i).getId().equals(t.getId())) {
                    estoque.remove(t);
                }
            }
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public static void listar() {
        estoque.forEach(System.out::println);
    }

    public static void editar(Produtos t) {
        if (!vetorVazio()) {
            for (int i = 0; i < estoque.size(); i++) {
                if (estoque.get(i).getId().equals(t.getId())) {
                    estoque.set(i, t);
                }
            }
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public static void somaTipoProduto() {
        AtomicInteger countBrinquedos = new AtomicInteger();
        AtomicInteger countLivros = new AtomicInteger();
        AtomicInteger countFilmes = new AtomicInteger();
        AtomicInteger countJogos = new AtomicInteger();
        AtomicInteger countMusicas = new AtomicInteger();
        getEstoque().forEach(x -> {
            if(x.toString().contains("Brinquedos")){
                countBrinquedos.getAndIncrement();
                System.out.println(x);
            }else if(x.toString().contains("Livros")){
                countLivros.getAndIncrement();
                System.out.println(x);
            }else if(x.toString().contains("Filmes")){
                countFilmes.getAndIncrement();
                System.out.println(x);
            }else if(x.toString().contains("Jogos")){
                countJogos.getAndIncrement();
                System.out.println(x);
            }else if(x.toString().contains("Musicas")){
                countMusicas.getAndIncrement();
                System.out.println(x);
            }
        });
        System.out.println("Total de Livros: " + countLivros);
        System.out.println("Total de Brinquedos: " + countBrinquedos);
        System.out.println("Total de Filmes: " + countFilmes);
        System.out.println("Total de Jogos: " + countJogos);
        System.out.println("Total de Musicas: " + countMusicas);
    }

    public static Boolean vetorVazio() {
        if (estoque.size() == 0) {
            System.out.println("Estoque Vazio!!!");
            return true;
        } else {
            return false;
        }
    }
}
