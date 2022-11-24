package main;

public class Caixa {

    private static Double valorTotal = 0d;

    public static Double getValorTotal() {
        return valorTotal;
    }
    public static void somaCarrinho(Double valorCompra){
        valorTotal += valorCompra;
    }
}
