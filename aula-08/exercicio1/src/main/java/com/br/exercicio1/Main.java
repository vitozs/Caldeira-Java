package com.br.exercicio1;

import com.br.exercicio1.classes.TratadorDeList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Cachorro");
        lista.add("Comida");
        lista.add("Comida");
        lista.add("Barata");
        lista.add("Feijao");

        TratadorDeList tratadorDeList = new TratadorDeList(lista);

        System.out.println(tratadorDeList.contadorDeString());
        tratadorDeList.getStringMaisLonga();
        tratadorDeList.getVezesString();

    }
}
