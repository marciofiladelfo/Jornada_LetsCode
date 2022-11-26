package main.financeiro;

import main.entities.Produtos;
import main.estoque.Estoque;
import main.utils.Conversor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Compra {

    private double valorCompra = 0d;
    private final static double VALOR_FIXO_DESCONTO = 200.00;
    private final static Integer PORCENTAGEM_DESCONTO = 15;
    public List<Produtos> produtosCompra = new ArrayList<>();

    public void efetuarCompra(List<Produtos> carrinho, CadastroComprador cadastroComprador) {
        /* Utilizado variável para interromper a compra quando menor comprar produto impróprio à idade */
        AtomicReference<Boolean> ongoing = new AtomicReference<>(true);

        carrinho.stream().takeWhile(item -> ongoing.get()).forEach(item -> {
            if (cadastroComprador.calcularIdade() < 18) {
                if (!item.getPublicoAdulto()) {
                    this.setValorCompra(this.getValorCompra() + item.getPreco());
                    Estoque.apagar(item);
                } else {
                    this.setValorCompra(0d);
                    System.out.println("Compra Bloqueada, comprador não pode consumir esse produto");
                    ongoing.set(false);
                }
            } else {
                this.setValorCompra(this.getValorCompra() + item.getPreco());
                Estoque.apagar(item);
            }
        });
        if (this.getValorCompra() >= VALOR_FIXO_DESCONTO) {
            this.setValorCompra(this.desconto(this.getValorCompra()));
        }
        Caixa.somaCarrinho(this.getValorCompra());
    }

    public double desconto(double valor) {
        double valorDesconto = (PORCENTAGEM_DESCONTO * valor) / 100;
        return Conversor.converterDoubleDoisDecimais(valor - valorDesconto);
    }

    public double getValorCompra() {
        return Conversor.converterDoubleDoisDecimais(valorCompra);
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
