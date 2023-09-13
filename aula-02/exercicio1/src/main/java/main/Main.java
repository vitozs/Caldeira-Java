package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primos = new ArrayList<Integer>();
        int numeroMin, numeroMax;


        System.out.println("Digite o numero minimo: ");
        numeroMin = scanner.nextInt();
        System.out.println("Digite o numero maximo: ");
        numeroMax = scanner.nextInt();


        for (int i = numeroMin; i < numeroMax; i++){
            if(primo(i) && i !=1){
                primos.add(i);
            }

        }

        /*
        * for (int i = 0; i < 100; i++){
        * for(int j = 2; j < i; j++){
        *   if(i%j != 0){
        *    primos.add(i);
        * }
        * }
        }
        * */
        for (int num : primos){
            System.out.printf("[%d]", num);
        }
    }
    private static boolean primo(int n){
        for(int j = 2; j < n; j++){
            if(n % j == 0 && n != 1){
                return false;
            }
        }
        return true;

        /*
        * for(int j = 2; j < n; j++){
            if(n % j != 0){
                return true;
            }
        }
        return false;*/
    }
}
