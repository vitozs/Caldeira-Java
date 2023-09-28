package classes;

import interfaces.Desenhavel;

public class Quadrado implements Desenhavel {
    private String nome = "Quadrado";

    @Override
    public void desenhar() {
        System.out.println("Desenhando " + this.nome);
    }
}
