package main;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String op;
        double n1,n2;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite a operacao: ");
            op = scanner.next();
            if(Objects.equals("n", op)){
                break;
            }
            System.out.println("Digite o primeiro numero: ");
            n1 = scanner.nextDouble();
            System.out.println("Digite o segundo numero: ");
            n2 = scanner.nextDouble();

            System.out.println("Resultado: " + calcular(n1,n2,op));
        }while(!Objects.equals("n", op));




    }

    private static double calcular(double n1, double n2, String op){
        double total = 0;
        switch (op){
            case "+":{
                 total = n1 + n2;
                 break;
            }
            case "-":{
                total = n1 - n2;
                break;
            }
            case "/":{
                total = n1/n2;
                break;
            }
            case "*":{
                total = n1*n2;
                break;
            }
            default:{
                System.out.println("Opcao invalida");
                break;
            }
        }
        return total;
    }
}
