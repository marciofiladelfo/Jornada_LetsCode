package main.administracao;

public class CalculoSoBanhoEEstadia implements Calculo {

    public Double getValorFinal(Checkout checkOut) {
        Double somaTotal = checkOut.getEstadia()
                + checkOut.getBanho();
        RegistroContabil.addRegistroContabil(checkOut.getCachorro(), somaTotal);
        return somaTotal;
    }
}