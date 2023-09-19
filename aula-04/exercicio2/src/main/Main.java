package main;
import classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
        formas.add(new Quadrado(4));
        formas.add(new Triangulo(2,5));
        formas.add(new Circulo(6));

        for (FormaGeometrica forma : formas){
            forma.calcularArea();
        }
    }
}
