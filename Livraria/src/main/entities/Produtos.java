package main.entities;

public class Produtos {
    private Integer id;
    private String nome;
    private double preco;
    private boolean publicoAdulto;
    public String tipoProduto;

    public Produtos(Integer id, String nome, double preco, boolean publicoAdulto, String tipoProduto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.publicoAdulto = publicoAdulto;
        this.tipoProduto = tipoProduto;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getPublicoAdulto() {
        return publicoAdulto;
    }

    public void setPublicoAdulto(boolean publicoAdulto) {
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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Produtos){
            if(this.id.equals(((Produtos) o).id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
