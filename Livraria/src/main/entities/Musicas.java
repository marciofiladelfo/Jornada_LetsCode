package main.entities;

public class Musicas extends Produtos{

    private String genero;
    private String musico;
    private String selo;

    public Musicas(Integer id, String nome, Double preco, String genero, String musico, String selo) {
        super(id, nome, preco);
        this.genero = genero;
        this.musico = musico;
        this.selo = selo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMusico() {
        return musico;
    }

    public void setMusico(String musico) {
        this.musico = musico;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    @Override
    public String toString() {
        return "Musicas=" +  super.toString() +
                "genero='" + genero + '\'' +
                ", musico='" + musico + '\'' +
                ", selo='" + selo + '\'' +
                "} ";
    }
}
