package main.entities;

public class Brinquedos extends Produtos{

    private String tipo;

    public Brinquedos(Integer id, String nome, double preco, String tipo, boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto, "Brinquedos");
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
        return "Brinquedo=" + super.toString() +
                "tipo='" + tipo + '\'' +
                "} \n";
    }
}
