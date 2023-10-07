package com.br.exercicio2.classes;

import java.util.*;
import java.util.stream.Collectors;

public class ProdutoManager {

    private List<Produto> lista;
    public ProdutoManager(List<Produto> lista){
        this.lista = lista;
    }

    public LinkedHashMap<String, Double> getProdutoMaisCaro(){
        Produto produto = lista.stream().max(Comparator.comparingDouble(Produto::getPreco)).get();

        LinkedHashMap<String, Double> maisCaro = new LinkedHashMap<>();

        maisCaro.put(produto.getNome(), produto.getPreco());

        return maisCaro;
    }

    public double getTotalProdutos(){
        double total = 0;
        List<Double> listaProdutos = lista.stream().map(Produto::calculaTotal).collect(Collectors.toList());

        for (double preco: listaProdutos) {
            total += preco;
        }

        return total;
    }

    public List<String> getProdutosPelaQuantidade(){
        List<Produto> produtos;
        produtos = lista.stream().filter(produto -> produto.getQuantidade() > 10).collect(Collectors.toList());

        List<String> produtosNome = new ArrayList<>();
        for (Produto produto : produtos){
            produtosNome.add(produto.getNome());
        }
        return produtosNome;
    }


}
