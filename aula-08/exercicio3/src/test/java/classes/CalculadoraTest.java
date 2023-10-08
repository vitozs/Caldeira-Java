package classes;

import exceptions.DivisaoPorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @DisplayName("Testa Adicao")
    @Test
    void adicaoTest(){
        Assertions.assertEquals(5, calculadora.adicao(3,2));
        Assertions.assertEquals(2, calculadora.adicao(3,-1));

    }

    @DisplayName("Testa Subtracao")
    @Test
    void subtracaoTest(){
        Assertions.assertEquals(-1, calculadora.subtracao(1, 2));
        Assertions.assertEquals(3, calculadora.subtracao(6,3));
    }

    @DisplayName("Testa Multiplicacao")
    @Test
    void multiplicacaoTest(){
        Assertions.assertEquals(6, calculadora.multiplicao(3,2));
        Assertions.assertEquals(0, calculadora.multiplicao(3, 0));
    }

    @DisplayName("Testa Divisao")
    @Test
    void divisaoTest(){
        Assertions.assertThrows(DivisaoPorZeroException.class, ()-> calculadora.divisao(3, 0)); //Testa se retorna a exception
        Assertions.assertThrows(DivisaoPorZeroException.class, ()-> calculadora.divisao(0, 3));
        Assertions.assertEquals(2, calculadora.divisao(4,2));

    }

    @DisplayName("Testa Raiz Quadrada")
    @Test
    void raizQuadradaTest(){
        Assertions.assertEquals(4, calculadora.raizQuadrada(16));
        Assertions.assertEquals(0, calculadora.raizQuadrada(0));
    }

    @DisplayName("Testa Potencia")
    @Test
    void potenciaTest(){
        Assertions.assertEquals(4, calculadora.potencia(2));
    }

}
