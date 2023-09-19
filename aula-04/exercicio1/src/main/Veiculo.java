package main;

abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public abstract double calcularCustoDistancia(int distancia);
}
