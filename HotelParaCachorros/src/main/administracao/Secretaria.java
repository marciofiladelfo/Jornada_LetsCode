package main.administracao;

import main.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {

    private static final List<Checkout> checkoutList = new ArrayList<>();

    public static Double getValorCheckout(Cachorro cachorro, Double estadia, Double comida, Double banho, Double tosa) {
        Checkout novoCheckOut = new Checkout(
                cachorro, estadia, comida, banho, tosa
        );

        checkoutList.add(novoCheckOut);
        Calculo calculo = null;

        // só estadia
        if (comida == 0.0 && banho == 0.0 && tosa == 0.0) {
            calculo = new CalculoSoEstadia();
        } else if (comida == 0.0 && tosa == 0.0) { // banho e estadia
            calculo = new CalculoSoBanhoEEstadia();
        } else {
//            calculo.getValorFinal(Secretaria.getValorCheckout());
        }

        return novoCheckOut.getValorFinal(calculo);
    }

    public static List<Checkout> getCheckOuts() {
        return checkoutList;
    }
}
