package classes;

import abs.*;

public class SeguroDeVida extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return this.saldo + 42;
    }
}
