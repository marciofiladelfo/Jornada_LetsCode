package main.estoque;

import main.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BuscarPorTipoProduto {

    private static List<Produtos> listTiposEspecificos = new ArrayList<>();

    public static void buscarLivros(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Livros).collect(Collectors.toList());
        System.out.println("Estoque de livros: " + listTiposEspecificos);
        clearVariables();
    }

    public static void buscarBrinquedos(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Brinquedos).collect(Collectors.toList());
        System.out.println("Estoque de brinquedos: " + listTiposEspecificos);
        clearVariables();
    }

    public static void buscarFilmes(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Filmes).collect(Collectors.toList());
        System.out.println("Estoque de filmes: " + listTiposEspecificos);
        clearVariables();
    }

    public static void buscarJogos(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Jogos).collect(Collectors.toList());
        System.out.println("Estoque de jogos: " + listTiposEspecificos);
        clearVariables();
    }

    public static void buscarMusicas(List<Produtos> list) {
        listTiposEspecificos = list.stream()
                .filter(p -> p instanceof Musicas).collect(Collectors.toList());
        System.out.println("Estoque de musicas: " + listTiposEspecificos);
        clearVariables();
    }

    private static void clearVariables(){
        listTiposEspecificos = new ArrayList<>();
    }
}
