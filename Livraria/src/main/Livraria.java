package main;

import main.entities.*;
import main.estoque.Estoque;
import main.estoque.ControleEstoque;
import main.financeiro.CadastroComprador;
import main.financeiro.Caixa;
import main.financeiro.Compra;
import main.utils.Conversor;

public class Livraria {

    public static void main(String[] args) {
        /* Cadastro de Produtos */
        Estoque.adicionar(new Livros(1, "SOLID", 135, "TI", "João",
                "Ada", false));
        Estoque.adicionar(new Brinquedos(3, "Carrinho", 50, "Controle remoto", false));
        Estoque.adicionar(new Livros(2, "Java", 80, "TI", "João",
                "Ada", false));
        Estoque.adicionar(new Filmes(4, "Mortos Vivos", 55, "Terror", "João",
                "Ada", "Zé do Caixão", true));
        Estoque.adicionar(new Jogos(5, "Minecraft", 210, "RPG", "Microsoft",
                "Ada", false));
        Estoque.adicionar(new Musicas(6, "Before I fogeter", 10, "Rock", "Slipknot",
                "Ada", true));

        /* Listagem de Produtos no estoque */
        System.out.println("*********************** Listagem de Produtos no estoque *****************************");
        Estoque.listar();

        /* Testes de controle de estoque */
        System.out.println("*********************** Controle de estoque *****************************");
        ControleEstoque.somaLivros(Estoque.estoque);
        ControleEstoque.somaBrinquedos(Estoque.estoque);
        ControleEstoque.somaFilmes(Estoque.estoque);
        ControleEstoque.somaJogos(Estoque.estoque);
        ControleEstoque.somaMusicas(Estoque.estoque);

        /* Exibe Estoque por categoria */
        System.out.println("*********************** Exibe estoque por categoria *****************************");
        Estoque.buscarLivros(Estoque.estoque);
        Estoque.buscarBrinquedos(Estoque.estoque);
        Estoque.buscarFilmes(Estoque.estoque);
        Estoque.buscarJogos(Estoque.estoque);
        Estoque.buscarMusicas(Estoque.estoque);

        /* Valor do Caixa Inicial */
        System.out.println("*********************** Valor do Caixa Inicial *****************************");
        System.out.println(Caixa.getValorTotal());

        /* Cadastro de comprador Menor */
        CadastroComprador cadastroCompradorMenor = new CadastroComprador("Pedro", "123", "123", "20/11/2010");

        /* Cadastro de comprador Maior */
        CadastroComprador cadastroCompradorMaior = new CadastroComprador("Marcio", "123", "123", "11/05/1982");

        /* Cadastros de Compras com desconto */
        Compra compra = new Compra();
        compra.produtosCompra.add(Estoque.getEstoque(1));
        compra.produtosCompra.add(Estoque.getEstoque(2));
        compra.produtosCompra.add(Estoque.getEstoque(4));
        compra.efetuarCompra(compra.produtosCompra, cadastroCompradorMaior);

        /* Exibe valor da compra e caixa */
        System.out.println("*********************** Exibe valor da compra e caixa *****************************");
        System.out.println(compra.getValorCompra());
        System.out.println(Caixa.getValorTotal());

        /* Cadastro de compras */
        Compra compra2 = new Compra();
        compra2.produtosCompra.add(Estoque.getEstoque(5));
        compra2.efetuarCompra(compra2.produtosCompra, cadastroCompradorMenor);

        /* Exibe valor da compra e caixa */
        System.out.println("*********************** Exibe valor da compra e caixa *****************************");
        System.out.println(compra2.getValorCompra());
        System.out.println(Caixa.getValorTotal());

        /* Cadastro de compras */
        System.out.println("*********************** Cadastros de Compras recusada pela idade *****************************");
        Compra compra3 = new Compra();
        compra3.produtosCompra.add(Estoque.getEstoque(6));
        compra3.efetuarCompra(compra3.produtosCompra, cadastroCompradorMenor);

        /* Exibe valor da compra e caixa */
        System.out.println("*********************** Exibe valor da compra e caixa *****************************");
        System.out.println(compra3.getValorCompra());
        System.out.println(Caixa.getValorTotal());

        /* Exibe Estoque após compras */
        System.out.println("*********************** Exibe Quantidade após compras *****************************");
        ControleEstoque.somaLivros(Estoque.estoque);
        ControleEstoque.somaBrinquedos(Estoque.estoque);
        ControleEstoque.somaFilmes(Estoque.estoque);
        ControleEstoque.somaJogos(Estoque.estoque);
        ControleEstoque.somaMusicas(Estoque.estoque);

        /* Exibe Estoque após compras */
        System.out.println("*********************** Exibe por categoria após compras *****************************");
        Estoque.buscarLivros(Estoque.estoque);
        Estoque.buscarBrinquedos(Estoque.estoque);
        Estoque.buscarFilmes(Estoque.estoque);
        Estoque.buscarJogos(Estoque.estoque);
        Estoque.buscarMusicas(Estoque.estoque);

        System.out.println("*********************** Listar estoque *****************************");
        Estoque.listar();
    }
}
