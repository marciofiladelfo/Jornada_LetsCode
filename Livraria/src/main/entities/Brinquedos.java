package main.entities;

public class Brinquedos extends Produtos{

    private String tipo;

    public Brinquedos(Integer id, String nome, Double preco, String tipo, Boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedos=" + super.toString() +
                "tipo='" + tipo + '\'' +
                "} ";
    }
}
