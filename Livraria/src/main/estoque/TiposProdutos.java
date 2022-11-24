package main.estoque;

public enum TiposProdutos {
    BRINQUEDOS("Brinquedo"),
    FILMES("Filme"),
    JOGOS("Jogo"),
    LIVROS("Livro"),
    MUSICAS("Musica");

    private final String descricao;

    TiposProdutos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
