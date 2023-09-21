package main;

public class Carro extends Veiculo{
    private double custo = 0.20;
    public Carro(String marca, String modelo, int ano){
        super(marca,modelo,ano);
    }
    @Override
    public double calcularCustoDistancia(int distancia) {
        return 0;
    }
}
