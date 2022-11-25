package main.administracao;

import main.Cachorro;

public class Checkout {

    private Cachorro cachorro;
    private Double estadia;
    private Double comida;
    private Double banho;
    private Double tosa;

    public Checkout(Cachorro cachorro, Double estadia, Double comida, Double banho, Double tosa) {
        this.cachorro = cachorro;
        this.estadia = estadia;
        this.comida = comida;
        this.banho = banho;
        this.tosa = tosa;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Double getEstadia() {
        return estadia;
    }

    public void setEstadia(Double estadia) {
        this.estadia = estadia;
    }

    public Double getComida() {
        return comida;
    }

    public void setComida(Double comida) {
        this.comida = comida;
    }

    public Double getBanho() {
        return banho;
    }

    public void setBanho(Double banho) {
        this.banho = banho;
    }

    public Double getTosa() {
        return tosa;
    }

    public void setTosa(Double tosa) {
        this.tosa = tosa;
    }

    public double getValorFinal(Calculo calculo){
        return calculo.getValorFinal(this);
    }
}
