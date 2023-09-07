package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        String frase = scanner.nextLine();

        for(int i=0; i<frase.length(); i++){
            for(int j=0; j<vogais.length; j++){
                if(frase.charAt(i) == vogais[j]){
                    total += 1;
                }
            }

        }

        System.out.println(total + " vogais");
    }

}
