package main.entities;

public class Jogos extends Produtos{

    private String genero;
    private String distribuidora;
    private String estudio;

    public Jogos(Integer id, String nome, Double preco, String genero, String distribuidora, String estudio) {
        super(id, nome, preco);
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
}
