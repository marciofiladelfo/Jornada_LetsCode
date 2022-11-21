package main.administracao;

public interface Calculo {
    default Double getValorFinal(Checkout checkout) {
        return checkout.getEstadia() + checkout.getBanho()
                + checkout.getTosa() + checkout.getComida();
    }
}
