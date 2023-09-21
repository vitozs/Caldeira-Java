package classes;
import abs.*;
public class GerenciadorDeImpostoDeRenda{

    private double somaTotal;
    public void adicionar(Tributavel pessoa){
        this.somaTotal += pessoa.calculaTributos();
    }

    public double getSomaTotal() {
        return somaTotal;
    }
}
