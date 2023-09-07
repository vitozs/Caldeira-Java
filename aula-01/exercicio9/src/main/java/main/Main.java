package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ano = 2023;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano que vc nasceu:");
        int anoN = scanner.nextInt();
        System.out.println("Voce tem " + (ano - anoN) + " anos");
    }
}
