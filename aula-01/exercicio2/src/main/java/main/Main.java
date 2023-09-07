package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1o numero");
        int n1 = scanner.nextInt();
        System.out.println("Digite o 2o numero");
        int n2 = scanner.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    }
}
