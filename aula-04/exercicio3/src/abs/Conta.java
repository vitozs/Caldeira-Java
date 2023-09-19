package abs;

public abstract class Conta {
    protected double saldo;

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void obterSaldo(){
        System.out.println(this.saldo);
    }
}
