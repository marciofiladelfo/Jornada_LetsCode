package main.administracao;

public class CalculoSoBanhoEEstadia extends Calculo {

    public double getValorFinal(Checkout checkOut) {
        double somaTotal = checkOut.getEstadia()
                + checkOut.getBanho();
        RegistroContabil.addRegistroContabil(checkOut.getCachorro(), somaTotal);
        return somaTotal;
    }
}