package main;

import main.utils.Conversor;

public class Caixa {

    private static double valorTotal = 0d;

    public static double getValorTotal() {
        return Conversor.converterDoubleDoisDecimais(valorTotal);
    }

    public static void somaCarrinho(double valorCompra) {
        valorTotal += valorCompra;
    }
}
