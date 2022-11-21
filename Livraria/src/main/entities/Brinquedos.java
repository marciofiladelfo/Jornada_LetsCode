package main.entities;

public class Brinquedos extends Produtos{

    private String tipo;

    public Brinquedos(Integer id, String nome, Double preco, String tipo) {
        super(id, nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
