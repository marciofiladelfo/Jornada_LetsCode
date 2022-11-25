package main;

public class Caes extends Cachorro {

    private String nome;
    private String cor;
    private String latido;

    public Caes(String nome, String cor, String latido) {
        this.nome = nome;
        this.cor = cor;
        this.latido = latido;
    }

    @Override
    public String latir() {
        return this.latido;
    }

    @Override
    public int compareTo(Cachorro cachorro){
        String nome = this.getNome();
        return nome.compareToIgnoreCase(cachorro.getNome());
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", latido='" + latido +
                '}';
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
