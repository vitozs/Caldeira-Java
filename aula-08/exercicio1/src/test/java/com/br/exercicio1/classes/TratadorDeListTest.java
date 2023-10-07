package com.br.exercicio1.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TratadorDeListTest {
    TratadorDeList tratadorDeList;
    List<String> lista = new ArrayList<>();
    @BeforeEach
    void upClass(){
        lista.add("Cachorro");
        lista.add("Comida");
        lista.add("Comida");
        lista.add("Barata");
        lista.add("Barata");
        lista.add("Barata");
        lista.add("Feijao");
        lista.add("Paralelepipedo");

        tratadorDeList = new TratadorDeList(lista);
    }

    @DisplayName("Verifica se retorna o numero total de Strings")
    @Test
    void totalStingsTest(){
        Assertions.assertEquals(8, tratadorDeList.contadorDeString());
    }

    @DisplayName("Verifica se retorna a String mais longa")
    @Test
    void stringMaisLonga(){
        Assertions.assertEquals("Paralelepipedo", tratadorDeList.getStringMaisLonga());
    }

    @DisplayName("Verifica se retorna um Map com o valor de cada String repetida")
    @Test
    void valoresRepetidos(){
        Map<Object, Long> map = tratadorDeList.getVezesString();


        map.forEach((k , v) ->
                Assertions.assertEquals(lista.stream()
                        .collect(Collectors.groupingBy(string -> string, Collectors.counting())), map)
        );
    }



}
