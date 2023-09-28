package classes;

import interfaces.Desenhavel;

public class Circulo implements Desenhavel {
    private String nome = "Circulo";

    @Override
    public void desenhar() {
        System.out.println("Desenhando " + this.nome);
    }
}
