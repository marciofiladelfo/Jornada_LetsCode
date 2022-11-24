package main.entities;

public class Fimes extends Produtos{

    private String genero;
    private String diretor;
    private String estudio;
    private String produtor;

    public Fimes(Integer id, String nome, Double preco, String genero, String diretor,
                 String estudio, String produtor, Boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto);
        this.genero = genero;
        this.diretor = diretor;
        this.estudio = estudio;
        this.produtor = produtor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return "Fimes=" + super.toString() +
                "genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                ", estudio='" + estudio + '\'' +
                ", produtor='" + produtor + '\'' +
                "} ";
    }
}
