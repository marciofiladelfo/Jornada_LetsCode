package main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Caes implements Cachorro {

    private String nome;
    private String cor;
    private String latido;
    private String rabo;

    public Caes(String nome, String cor, String latido, Boolean rabo) {
        this.nome = nome;
        this.cor = cor;
        this.latido = latido;
        this.rabo = this.balancaORabo(rabo);
    }

    @Override
    public String latir() {
        return this.latido;
    }

    @Override
    public String balancaORabo(Boolean rabo) {
        return rabo ? "Balançando" : "Parado";
    }

    @Override
    public int compareTo(Caes caes) {
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
