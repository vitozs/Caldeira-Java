package classes;

import org.w3c.dom.css.CSSImportRule;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println(3.14 * (Math.pow(raio, 2)));
    }
}
