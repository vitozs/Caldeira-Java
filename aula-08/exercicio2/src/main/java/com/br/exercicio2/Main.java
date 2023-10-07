package com.br.exercicio2;

import com.br.exercicio2.classes.Produto;
import com.br.exercicio2.classes.ProdutoManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Sabonete", 2.4, 10));
        listaProdutos.add(new Produto("Pao", 3.4, 20));
        listaProdutos.add(new Produto("Pilha", 4.5, 11));
        listaProdutos.add(new Produto("Shampoo", 7.4, 5));


        ProdutoManager produtoManager = new ProdutoManager(listaProdutos);
        System.out.println(produtoManager.getProdutoMaisCaro());
        System.out.println(produtoManager.getTotalProdutos());
        System.out.println(produtoManager.getProdutosPelaQuantidade());


    }
}
