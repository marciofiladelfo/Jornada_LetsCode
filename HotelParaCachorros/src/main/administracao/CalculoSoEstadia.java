package main.administracao;

public class CalculoSoEstadia extends Calculo {

    public double getValorFinal(Checkout checkOut){
        double somaTotal = checkOut.getEstadia();
        RegistroContabil.addRegistroContabil(checkOut.getCachorro(), somaTotal);
        return somaTotal;
    }
}
