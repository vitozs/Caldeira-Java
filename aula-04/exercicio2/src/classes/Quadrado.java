package classes;

public class Quadrado extends FormaGeometrica{
    private double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println(Math.pow(lado, 2));
    }
}
