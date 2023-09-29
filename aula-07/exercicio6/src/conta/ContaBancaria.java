package conta;

import exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo = 100;

    public void sacar(double valor){
        try{
            if(this.saldo > valor){
               this.saldo -= valor;
                System.out.println("Saldo efetuado com sucesso!!!");
            }else{
                throw new SaldoInsuficienteException("Saldo insuficiente na conta!!!");
            }
        }catch (SaldoInsuficienteException e){
            System.err.println("ERRO!\n " + e);
        }
    }
}
