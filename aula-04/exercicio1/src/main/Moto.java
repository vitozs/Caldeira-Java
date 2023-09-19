package main;

public class Moto extends Veiculo{
    double custo = 0.15;


    @Override
    public double calcularCustoDistancia(int distancia) {
        return this.custo * distancia;
    }
}
