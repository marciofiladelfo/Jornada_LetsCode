package main;

import main.entities.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Estoque<T extends Produtos> {

    private final List<Produtos> estoque = new ArrayList<>();

    public void add(T t) {
        if (!estoque.contains(t)) {
            estoque.add(t);
        }
    }

    public void remove(Integer id) {
        if (!vetorVazio()) {
            for (int i = 0; i < this.estoque.size(); i++) {
                if (this.estoque.get(i).getId().equals(id)) {
                    estoque.remove(i);
                }
            }
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public void list() {
        estoque.forEach(System.out::println);
    }

    public void edit(T t) {
        if (!vetorVazio()) {
            for (int i = 0; i < this.estoque.size(); i++) {
                if (this.estoque.get(i).getId().equals(t.getId())) {
                    this.estoque.set(i, t);
                }
            }
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public void somaTipoProduto() {
        AtomicInteger countBrinquedos = new AtomicInteger();
        AtomicInteger countLivros = new AtomicInteger();
        estoque.forEach(x -> {
            if(x.toString().contains("Brinquedos")){
                countBrinquedos.getAndIncrement();
                System.out.println(x);
            }else if(x.toString().contains("Livros")){
                countLivros.getAndIncrement();
                System.out.println(x);
            }
        });
        System.out.println("Total de Livros: " + countLivros);
        System.out.println("Total de Brinquedos: " + countBrinquedos);
    }

    public Boolean vetorVazio() {
        if (this.estoque.size() == 0) {
            System.out.println("Estoque Vazio!!!");
            return true;
        } else {
            return false;
        }
    }
}
