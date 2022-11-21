package main.administracao;

public class CalculoSoEstadia implements Calculo {

    public Double getValorFinal(Checkout checkOut){
        Double somaTotal = checkOut.getEstadia();
        RegistroContabil.addRegistroContabil(checkOut.getCachorro(), somaTotal);
        return somaTotal;
    }
}
