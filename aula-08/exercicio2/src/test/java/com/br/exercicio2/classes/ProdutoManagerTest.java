package com.br.exercicio2.classes;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ProdutoManagerTest {
    ProdutoManager produtoManager;
    List<Produto> listaProdutos = new ArrayList<>();


    @BeforeEach
    void setUp(){
        listaProdutos.add(new Produto("Sabonete", 2.4, 10));
        listaProdutos.add(new Produto("Pao", 3.4, 20));
        produtoManager = new ProdutoManager(listaProdutos);

    }

    @DisplayName("Pega o total dos produtos")
    @Test
    void getTotalProdutos(){
        Assertions.assertEquals(92,produtoManager.getTotalProdutos());
    }

    @DisplayName("Pega o produto mais caro")
    @Test
    void getMaisCaro(){

        Assertions.assertEquals(produtoManager.getProdutoMaisCaro().get("Pao"), listaProdutos.get(1).getPreco() );


    }


    @DisplayName("Nova lista de produtos com qtd maiores que 10")
    @Test
    void getNovaLista(){
        Assertions.assertEquals(produtoManager.getProdutosPelaQuantidade().get(0) , listaProdutos.get(1).getNome());
    }


}
