package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        String palavra = scanner.nextLine();
        int mid = palavra.length()/2;
        System.out.printf("Primeira metade: %s \n", palavra.substring(0, mid));
        System.out.printf("Segunda metade: %s", palavra.substring(mid));

    }
}
