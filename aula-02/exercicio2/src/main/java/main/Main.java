package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        double salario;
        do{
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            if (idade < 18){
                System.out.println("Menores de idade nao compram aqui!!!");
                continue;
            }else{
                System.out.println("Qual o seu salario: ");
                salario = scanner.nextDouble();
                if(salario >= 2000.00){
                    System.out.println("Compra autorizada!");
                }else{
                    System.out.println("Compra nao autorizada!");
                    continue;

                }
            }

        }while(true);



    }
}
