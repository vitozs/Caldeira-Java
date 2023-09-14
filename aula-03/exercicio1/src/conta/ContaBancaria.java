package conta;

import java.time.LocalTime;
import java.util.ArrayList;

public class ContaBancaria {
    private String nome;
    private int cpf;
    private int id;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;
    private ArrayList<String> historico = new ArrayList<String>();
    private boolean ativa = true;

    public ContaBancaria(String nome, int cpf, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = (int)(Math.random() * 10);
        this.banco = banco;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if(Integer.toString(cpf).length() > 8){
            this.cpf = cpf;
        }else{
            System.out.println("Insira um cpf valido");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getHorarioAtual() {
        return LocalTime.now().getHour();
    }

    public void setHorarioAtual(LocalTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }


    public void saque(double valor){
        if(ativa){
            if(valor < this.saldo){
                this.saldo -= valor;
                System.out.println("Saque efetuado no valor de: "+ valor);
                System.out.println("Seu saldo atual: " + this.getSaldo());
                historico.add("Saque feito de " + valor);
            }else{
                System.out.println("Saldo insuficiente para o valor do saque!");
            }
        }else{
            System.out.println("Voce nao tem permissao para fazer isso, crie outra conta");
        }


    }

    public void deposito(double valor, ContaBancaria destino){
        if(ativa){
            destino.saldo += valor;
            historico.add("Deposito feito de " + valor);
        }else{
            System.out.println("Voce nao tem permissao para fazer isso, crie outra conta");

        }

    }

    public void pix(double valor, ContaBancaria destino){
        if(ativa){
            if(valor < this.saldo){
                destino.saldo += valor;
                System.out.println("Pix efetuado com sucesso no valor de: " + valor);
                System.out.println("Seu saldo atual: " + this.getSaldo());
                historico.add("Pix feito de " + valor);
            }
            System.out.println("Saldo insuficiente para a transferencia!!");
        }else{
            System.out.println("Voce nao tem permissao para fazer isso, crie outra conta");

        }

    }

    public void transferencia(ContaBancaria destino, double valor){
        if(ativa){
            int horaAtual = this.getHorarioAtual();

            if((horaAtual >= 8 &&  horaAtual <= 19) && this.getSaldo() > valor){
                destino.deposito(valor, destino);
                System.out.println("Transferencia efetuada para " + destino.nome + "no valor de " + valor);
                historico.add("Transferencia feita de " + valor);
            }else{
                System.out.println("Horario ou conta invalidos");
            }
        }else{
            System.out.println("Voce nao tem permissao para fazer isso, crie outra conta");
        }

    }

    public void verificarSaldo(){
        System.out.println("Seu saldo atual é: " + this.getSaldo());
    }

    public void verificarHorario(){
        System.out.println("São " + LocalTime.now());
    }

    public void verificarInformacoes(){
        System.out.printf("\n Nome: %1$s", this.getNome());
        System.out.printf("\n Cpf: %1$s", this.getCpf());
        System.out.printf("\n Id: %1$s", this.getId());
        System.out.printf("\n Banco: %1$s", this.getBanco());
        System.out.printf("\n Endereco: %1$s", this.getEndereco());
        System.out.printf("\n Saldo: %1$s", this.getSaldo());
    }

    public void verificarHistorico(){
        for(String info : historico){
            System.out.println(info);
        }
    }

    public void alterarEndereco(String endereco){
        if(ativa){
            this.setEndereco(endereco);
        }else{
            System.out.println("Voce nao tem permissao para fazer isso, crie outra conta");
        }

    }

    public void fecharConta(){
        this.saldo = 0;
        this.ativa = false;
    }

}
