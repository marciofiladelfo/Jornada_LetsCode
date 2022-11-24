package main;

import main.administracao.Financeiro;
import main.administracao.RegistroContabil;
import main.administracao.Secretaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel {

    private final static List<Caes> listCaes = new ArrayList<>();

    public static void imprimeHospedes(){
        listCaes.forEach(c -> System.out.println(c.latir()));
    }

    public static void main(String[] args) {

        listCaes.add(new ViraLatas("Caramelo", "Caramelo"));
        listCaes.add(new Labrador(10));
        listCaes.add(new Pincher("Ragnar","Preto"));

//        Collections.sort(hotel.listCaes, (a,b) -> a.getNome().compareTo(b.getNome()));
        Collections.sort(listCaes);
        imprimeHospedes();
        listCaes.forEach(c -> sairDoHotel(c));
        Financeiro.getRelatorioFinanceiro(RegistroContabil.livroContabil);
    }

    public static void sairDoHotel(Cachorro cachorro){
        Double valor = Secretaria.getValorCheckout(
                cachorro, 1.0, 2.0, 3.0, 4.0
        );

        System.out.println(valor);

    }
}
