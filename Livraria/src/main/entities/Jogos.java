package main.entities;

public class Jogos extends Produtos {

    private String genero;
    private String distribuidora;
    private String estudio;

    public Jogos(Integer id, String nome, double preco, String genero, String distribuidora,
                 String estudio, boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto, "Jogos");
        this.genero = genero;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogo=" + super.toString() +
                "genero='" + genero + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                ", estudio='" + estudio + '\'' +
                "} \n";
    }
}
