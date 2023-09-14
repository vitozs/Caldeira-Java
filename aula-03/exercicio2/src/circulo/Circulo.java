package circulo;

import java.awt.*;

public class Circulo{
    private double raio;
    private final double  pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        double area = pi * Math.pow(raio, 2);
        if(area < 0){
            return Math.abs(area);
        }else{
            return area;
        }

    }

    public double calcularCircunferencia(){
        double circ = 2*pi*raio;
        if(circ < 0){
            return Math.abs(circ);
        }else{
            return 2*pi*raio;
        }

    }

    public void definirRaio(double raioN){
        this.raio = raioN;
    }

    @Override
    public String toString(){
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Circunferencia: " + this.calcularCircunferencia());
        return null;
    }

    public void verificaCirculos(Circulo circulo){
        if(circulo.raio == raio){
            System.out.println("Os dois sao iguais!!!");
        }else{
            System.out.println("Nao sao iguais!!!");
        }
    }

    public double calculaDiametro(){
        return 2*raio;
    }

    public double areaSombreada(Circulo c1, Circulo c2){
        if(c1.raio > c2.raio){
            return c1.calcularArea() - c2.calcularArea();
        }else{
            return c2.calcularArea() - c1.calcularArea();
        }
    }

}
