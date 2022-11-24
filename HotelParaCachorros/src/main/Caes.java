package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Caes extends Cachorro {

    private String nome;
    private String cor;
    private String latido;
    private String rabo;

    public Caes(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    @Override
    public String latir() {
        return this.latido;
    }

    @Override
    public int compareTo(Cachorro caes) {
        return this.nome.compareTo(caes.getNome());
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", latido='" + latido + '\'' +
                ", rabo=" + rabo +
                '}';
    }
}
