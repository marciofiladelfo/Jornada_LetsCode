package main;

import main.administracao.Hospede;

public abstract class Cachorro extends Hospede implements Comparable<Cachorro> {
    public abstract String latir();
    public abstract String getNome();
}
