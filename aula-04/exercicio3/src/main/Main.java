package main;
import classes.*;
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaPoupanca conta2 = new ContaPoupanca();
        SeguroDeVida conta3 = new SeguroDeVida();
        Teste teste = new Teste(1);
        GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
        conta2.depositar(200);
        conta3.depositar(200);
        conta1.depositar(200);
        System.out.println(conta1.calculaTributos());
        System.out.println(conta2.calculaTributos());
        System.out.println(conta3.calculaTributos());
        g.adicionar(conta1);
        g.adicionar(conta1);
        g.adicionar(conta1);
        System.out.println(g.getSomaTotal());
        g.adicionar(teste);


    }
}
