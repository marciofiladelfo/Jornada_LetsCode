package main.entities;

public class Produtos {
    private Integer id;
    private String nome;
    private Double preco;
    private Boolean publicoAdulto;

    public Produtos(Integer id, String nome, Double preco, Boolean publicoAdulto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.publicoAdulto = publicoAdulto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getPublicoAdulto() {
        return publicoAdulto;
    }

    public void setPublicoAdulto(Boolean publicoAdulto) {
        this.publicoAdulto = publicoAdulto;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Público Adulto?='" + publicoAdulto + '\'' +
                ", preco=" + preco + '\'' +
                ' ';
    }
}
