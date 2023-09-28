import enums.Operacoes;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            Calculadora calculadora = new Calculadora();

            System.out.println("=====================");
            for(Operacoes op : Operacoes.values()){
                System.out.println(op.name());
            }
            System.out.println("======================");
            System.out.println("Digite a operacao: ");

            Operacoes op = Operacoes.valueOf(scanner.next().toUpperCase());



            switch (op){
                case ADD:
                  calculadora.adicionar();
                break;
                case SUB:
                    calculadora.subtrair();
                    break;
                case MULT:
                    calculadora.multiplicar();
                    break;
                case DIV:
                    calculadora.dividir();
                    break;
            }
        }catch (InputMismatchException e){
            System.err.println("Apenas numeros inteiros sao aceitos nessa calculadora!!!!"); //Trata erro caso o input nao for int
        }catch (IllegalArgumentException e){
            System.err.println("Nao foi possivel achar a operacao! Tente novamente. " + e); //Trata erro caso nao encontre a operacao digitada
        }
    }
}
