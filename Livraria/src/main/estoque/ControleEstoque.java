package main.estoque;

import main.entities.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface ControleEstoque {

    static int totalProdutosPorTipoNoEstoque(List<Produtos> list, String tipo) {
        AtomicInteger count = new AtomicInteger();
        list.stream().filter(p -> p.tipoProduto.equals(tipo))
                .forEach(x -> count.getAndIncrement());
        return count.get();
    }
}
