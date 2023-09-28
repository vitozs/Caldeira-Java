import interfaces.Calculavel;

import java.util.Scanner;

public class Calculadora implements Calculavel {

    Scanner scanner = new Scanner(System.in);

    public int getNumber(int num){
        System.out.println("Numero "+ num +": ");
        return scanner.nextInt();
    }
    @Override
    public void adicionar() {

        System.out.println(getNumber(1) + getNumber(2));
    }

    @Override
    public void subtrair() {
        System.out.println(getNumber(1) - getNumber(2));


    }

    @Override
    public void multiplicar() {
        System.out.println(getNumber(1) * getNumber(2));

    }

    @Override
    public void dividir() {
        System.out.println(getNumber(1) / getNumber(2));

    }
}
