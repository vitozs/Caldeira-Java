package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva sua idade: ");
        int idade = scanner.nextInt();
        if(idade < 16){
            System.out.println("Voce nao pode votar!");
        }
        if(idade == 16 || idade == 17 || idade >= 65){
            System.out.println("Voce tem direito ao voto facultativo");
        }
        if(idade >= 18 || idade <= 65){
            System.out.println("Voce 'e obrigado a votar");
        }
    }
}
