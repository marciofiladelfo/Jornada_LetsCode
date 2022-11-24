package main.entities;

public class Livros extends Produtos implements Comparable<Produtos>{

    private String genero;
    private String escritor;
    private String editora;

    public Livros(Integer id, String nome, Double preco, String genero, String escritor,
                  String editora, Boolean publicoAdulto) {
        super(id, nome, preco, publicoAdulto);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return  "Livros=" + super.toString() +
                "genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                "} ";
    }
    @Override
    public int compareTo(Produtos o) {
        return this.toString().compareTo("Livros=");
    }
}
