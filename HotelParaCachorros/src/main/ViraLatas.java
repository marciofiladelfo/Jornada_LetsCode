package main;

public class ViraLatas extends Caes implements Comparable<Cachorro> {

    public ViraLatas(String nome, String cor) {
        super(nome, cor, "awrawrawrawrawr");

    }

    public String latir() {
        return "awrawrawrawrawr";
    }

    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().toLowerCase().compareTo(cachorro.getNome().toLowerCase());
    }
}
