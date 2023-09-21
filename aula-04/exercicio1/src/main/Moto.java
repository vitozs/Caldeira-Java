package main;

public class Moto extends Veiculo{
    double custo = 0.15;

    public Moto(String marca, String modelo, int ano){
        super(marca,modelo,ano);
    }
    @Override
    public double calcularCustoDistancia(int distancia) {
        return this.custo * distancia;
    }
}
