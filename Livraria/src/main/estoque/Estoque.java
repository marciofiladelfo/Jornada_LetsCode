package main.estoque;

import main.entities.Produtos;

import java.util.ArrayList;
import java.util.List;


public class Estoque<T extends Produtos> extends BuscarPorTipoProduto {

    public static List<Produtos> estoque = new ArrayList<>();

    public static void adicionar(Produtos t) {
        if (!estoque.contains(t)) {
            estoque.add(t);
        }
    }

    public static Produtos getEstoque(Integer id) {
        List<Produtos> p = new ArrayList<>();
        estoque.forEach(item -> {
            if (item.getId().equals(id)) {
                p.add(item);
            }
        });
        return p.get(0);
    }

    public static void apagar(Produtos t) {
        if (!vetorVazio()) {
            for (int i = 0; i < estoque.size(); i++) {
                if (estoque.get(i).getId().equals(t.getId())) {
                    estoque.remove(t);
                }
            }
        } else {
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
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public static boolean vetorVazio() {
        if (estoque.size() == 0) {
            System.out.println("Estoque Vazio!!!");
            return true;
        } else {
            return false;
        }
    }
}
