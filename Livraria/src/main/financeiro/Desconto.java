package main.financeiro;

import main.utils.Conversor;

public class Desconto {
    public final static double VALOR_FIXO_DESCONTO = 200.00;
    public final static Integer PORCENTAGEM_DESCONTO = 15;

    public static double desconto(double valor) {
        double valorDesconto = (PORCENTAGEM_DESCONTO * valor) / 100;
        return Conversor.converterDoubleDoisDecimais(valor - valorDesconto);
    }
}
