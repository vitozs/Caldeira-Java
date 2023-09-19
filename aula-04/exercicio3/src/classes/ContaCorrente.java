package classes;
import abs.*;
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {

        return (this.saldo * (0.1));
    }
}
