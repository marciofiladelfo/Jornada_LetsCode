package main.administracao;

import main.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class RegistroContabil {

    public static List<RegistroContabil> livroContabil = new ArrayList<>();
    private Cachorro cachorro;
    private Double valorFinal;

    public RegistroContabil(Cachorro cachorro, Double valorFinal) {
        this.cachorro = cachorro;
        this.valorFinal = valorFinal;
    }

    public static List<RegistroContabil> getLivroContabil() {
        return livroContabil;
    }

    public static void setLivroContabil(List<RegistroContabil> livroContabil) {
        RegistroContabil.livroContabil = livroContabil;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public static void addRegistroContabil(Cachorro cachorro, Double valorFinal) {
        livroContabil.add(new RegistroContabil(cachorro, valorFinal));
    }
}
