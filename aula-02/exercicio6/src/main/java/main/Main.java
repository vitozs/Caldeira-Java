package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = scanner.next();
        String p = "";
        for (int i = palavra.length(); i > 0; i--){
            p += palavra.charAt(i-1);
        }
        System.out.println(p);

    }
}
