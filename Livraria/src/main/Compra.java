package main;

import main.entities.Produtos;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Compra {

    private Double valorCompra = 0d;

    public void efetuarCompra(List<Produtos> carrinho, CadastroComprador cadastroComprador){
        AtomicReference<Boolean> ongoing = new AtomicReference<>(true);
            carrinho.stream().takeWhile(item -> ongoing.get()).forEach(item -> {
            if(cadastroComprador.calcularIdade() < 18){
                if (!item.getPublicoAdulto()){
                    this.setValorCompra(this.getValorCompra() + item.getPreco());
                    Caixa.somaCarrinho(this.getValorCompra());
                    Estoque.apagar(item);
                } else {
                    this.setValorCompra(0d);
                    System.out.println("Compra Bloqueada, comprador não pode consumir esse produto");
                    ongoing.set(false);
                }
            }else {
                this.setValorCompra(this.getValorCompra() + item.getPreco());
                Caixa.somaCarrinho(this.getValorCompra());
                Estoque.apagar(item);
            }
        });
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
