package com.br.exercicio1.classes;

import javax.management.ObjectName;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.maxBy;

public class TratadorDeList {

    private List<String> lista;

    public TratadorDeList(List<String> lista){
        this.lista = lista;
    }

    public long contadorDeString(){

        return lista.stream().count();

    }

    public String getStringMaisLonga(){
        String max = lista.stream().max(Comparator.comparingInt(String::length)).get();
        return max;
    }

    public TreeMap<Object, Long> getVezesString(){
        Map<Object, Long> collect = lista.stream()
                .collect(Collectors.groupingBy(string -> string, Collectors.counting()));

        TreeMap<Object, Long> treeMap = new TreeMap<>(collect);

        return treeMap;
    }



}
