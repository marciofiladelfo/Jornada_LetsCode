package main;

import main.administracao.*;

public class Hotel {

    private static Booking<Cachorro> hospedesCaninos = new Booking<>();
    private static Booking<Gato> hospedesFelinos = new Booking<>();
    private static Booking<Passaro> hospedesQueVoam = new Booking<>();

    public static void main(String[] args) {

        hospedesCaninos.addHospede(new Pincher("totó", "caramelo"));
        hospedesCaninos.addHospede(new Pincher("bebê", "preto"));
        hospedesCaninos.addHospede(new Labrador("Bob", "amarelo"));
        hospedesCaninos.addHospede(new Labrador("Pitu", "marrom"));
        hospedesCaninos.addHospede(new ViraLatas("Caramelo", "branco"));

        hospedesFelinos.addHospede(new Gato());

        hospedesCaninos.getHospedes().forEach(c -> c.latir());
        hospedesCaninos.getHospedes().forEach(c -> sairDoHotel(c));

        Financeiro.getRelatorioFinanceiro(RegistroContabil.livroContabil);
    }

    public static void sairDoHotel(Cachorro cachorro){
        double valor = Secretaria.getValorCheckout(
                cachorro, 1.0, 2.0, 3.0, 4.0
        );

        System.out.println(valor);

    }
}
