package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Labrador extends Cachorro implements Comparable<Cachorro>{
    private int idade;

    public Labrador(int idade) {
        this.idade = idade;
    }

    @Override
    public String latir() {
        return "RoufRouf";
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int compareTo(Cachorro o) {
        return this.getNome().toLowerCase().compareTo(o.getNome().toLowerCase());
    }
}
