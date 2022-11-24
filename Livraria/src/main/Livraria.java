package main;

import main.entities.Brinquedos;
import main.entities.Livros;
import main.entities.Produtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livraria {

    public static void main(String[] args) {
        Estoque.adicionar(new Livros(1, "Java", 80.0, "TI", "João", "Ada", true));
        Estoque.adicionar(new Brinquedos(3, "Carrinho", 80.0, "infantil", false));
        Estoque.adicionar(new Livros(2, "Java", 80.0, "TI", "João", "Ada", true));
//        Estoque.list();
        Estoque.editar(new Livros(1, "Java3", 80.0, "TI", "João", "Ada", false));
//        Estoque.list();
//        Estoque.remove(1);
        Estoque.somaTipoProduto();
        System.out.println(Caixa.getValorTotal());
        CadastroComprador cadastroComprador = new CadastroComprador("Marcio", "123", "123", "11/05/2010");

        Compra compra = new Compra();
        List<Produtos> novaCompra = new ArrayList<>();
        novaCompra.add(new Livros(20, "Java", 80.0, "TI", "João", "Ada", false));
        novaCompra.add(new Livros(21, "Java", 80.0, "TI", "João", "Ada", false));
        novaCompra.add(new Livros(20, "Java", 80.0, "TI", "João", "Ada", false));
        compra.efetuarCompra(novaCompra, cadastroComprador);
        System.out.println(compra.getValorCompra());

        Compra compra2 = new Compra();
        compra2.efetuarCompra(Collections.singletonList(new Livros(20, "Java", 80.0, "TI", "João", "Ada", false)), cadastroComprador);
        System.out.println(compra2.getValorCompra());
        System.out.println(Caixa.getValorTotal());
//        Estoque.list();
    }
}
