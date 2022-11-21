package main;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T> {

    public List<T> estoque = new ArrayList<>();

    public void add(T t) {
        estoque.add(t);
    }

    public void remove(T t){
        estoque.remove(t);
    }

    public void list(){
        estoque.forEach(System.out::println);
    }

//    public void edit(Integer id){
//        estoque.forEach(x -> {
//            if(x.getClass(). == id) {
//                p.setNome(nome);
//            }
//    });


    public List<T> getEstoque() {
        return estoque;
    }
}
