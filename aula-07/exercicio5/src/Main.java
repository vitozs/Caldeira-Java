import exception.IdadeInvalidaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            if(idade < 0 || idade > 150){
                throw new IdadeInvalidaException("Idade invalida!! Ela deve ser maior que 0 e menor que 150");
            }
        }catch (IdadeInvalidaException e){
            System.err.println("Erro: " + e);
        }catch (InputMismatchException e){
            System.err.println("ERRO! Apenas numeros inteiros pfvr... " + e);
        }


    }
}
