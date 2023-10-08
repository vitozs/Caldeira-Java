package classes;

import exceptions.DivisaoPorZeroException;

public class Calculadora {


    public double adicao(double n1, double n2){
        return n1 + n2;
    }

    public double subtracao(double n1, double n2){
        return n1 - n2;
    }

    public double divisao(double n1, double n2){
        if(n1 == 0 || n2 == 0){
            throw new DivisaoPorZeroException();
        }
        return n1 / n2;
    }

    public double multiplicao(double n1, double n2){
        return n1 * n2;
    }

    public double raizQuadrada(double n1){
        return Math.sqrt(n1);
    }

    public double potencia(double n1){
        return Math.pow(n1, 2);
    }


}
