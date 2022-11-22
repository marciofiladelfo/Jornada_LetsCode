package main;

import main.entities.Brinquedos;
import main.entities.Livros;
import main.entities.Produtos;

public class Livraria {

    private final static Estoque<Produtos> listEstoque = new Estoque<>();

    public static void main(String[] args) {
        listEstoque.add(new Livros(1, "Java", 80.0, "TI", "João", "Ada"));
        listEstoque.add(new Brinquedos(3, "Carrinho", 80.0, "infantil"));
        listEstoque.add(new Livros(2, "Java", 80.0, "TI", "João", "Ada"));
//        listEstoque.list();
        listEstoque.edit(new Livros(1, "Java3", 80.0, "TI", "João", "Ada"));
//        listEstoque.list();
//        listEstoque.remove(1);
        listEstoque.somaTipoProduto();
//        listEstoque.list();
    }
}
