package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Seu salario: ");
        double salario = scanner.nextDouble();
        if(salario > 2000 && idade > 18){
            System.out.println("Compra autorizada!");
        }else{
            System.out.println("Compra nao autorizada...");

        }
    }
}
