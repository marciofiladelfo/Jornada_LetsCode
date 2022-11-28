package main.estoque;

import main.entities.Produtos;

import java.util.List;
import java.util.stream.Collectors;

public interface BuscarPorTipoProduto {

    static List<Produtos> filtraTipoProduto(List<Produtos> list, String tipo) {
        return list.stream()
                .filter(p -> p.tipoProduto.equals(tipo)).collect(Collectors.toList());
    }
}
