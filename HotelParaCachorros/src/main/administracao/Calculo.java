package main.administracao;

public class Calculo {
    public double getValorFinal(Checkout checkOut){
        double somaTotal = checkOut.getEstadia() +
                checkOut.getBanho() +
                checkOut.getTosa() +
                checkOut.getComida();

        return somaTotal;
    }
}
