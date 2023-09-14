package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sugestao = 0;

        while(sugestao != 300000){
            System.out.print("Palpite: ");
            sugestao = scanner.nextInt();

            if(sugestao == 300000){
                System.out.println("Exato!");
            }else if(sugestao > 300000){
                System.out.println("Um pouco menos!");
            }else{
                System.out.println("Um pouco mais!");

            }
        }
    }
}
