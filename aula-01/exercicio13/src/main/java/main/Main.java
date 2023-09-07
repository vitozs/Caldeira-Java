package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 1;
        System.out.println("Digite um numero inteiro nao negativo");
        int num = scanner.nextInt();
        if(num < 0){
            System.out.println("Digite outro numero!");
        }else{
            for (int i=num; i!=0; i--){
                total *= i;
                System.out.println(total);

            }
            System.out.println(total);
        }
    }
}
