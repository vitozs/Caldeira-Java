package com.br.exercicio5.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

public class OperacaoNumeroTest {

    OperacaoNumero operacaoNumero = new OperacaoNumero();

    @DisplayName("Metodo 1")
    @Test
    void testaSoma(){
        int[] arr = {1,2,5,-2};

        Assertions.assertEquals(6, operacaoNumero.somarNumeros(arr));


    }

    @DisplayName("Metodo 2")
    @ParameterizedTest
    @ValueSource(ints = {2,4,8,12,10,22})
    void testaPar(int num){
        Assertions.assertTrue(operacaoNumero.ehPar(num));
    }

    @DisplayName("Metodo 3")
    @Test
    void testaFatorial(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->  operacaoNumero.calcularFatorial(-1));

        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(0));
        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(1));

        Assertions.assertEquals(3628800, operacaoNumero.calcularFatorial(10));

    }

    @DisplayName("Metodo 4")
    @Test
    void testaPalindromo(){
        Assertions.assertFalse(operacaoNumero.ehPalindromo("texto"));
        Assertions.assertTrue(operacaoNumero.ehPalindromo("renner"));
    }

    @DisplayName("Metodo 5")
    @Test
    void testaFibonacci(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> operacaoNumero.calcularFibonacci(-1));

        Assertions.assertEquals(0, operacaoNumero.calcularFibonacci(0));
        Assertions.assertEquals(1, operacaoNumero.calcularFibonacci(1));

        Assertions.assertEquals(21, operacaoNumero.calcularFibonacci(8));
    }



}
