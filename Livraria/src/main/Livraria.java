package main;

import main.entities.Livros;

public class Livraria {

    private final static Estoque<Object> listEstoque = new Estoque<>();

    public static void main(String[] args) {
        listEstoque.add(new Livros(1, "Java", 80.0, "TI", "João", "Ada"));
        listEstoque.list();
    }
}
