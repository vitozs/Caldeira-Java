package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em dolar ($ - R$)");
        double dol = scanner.nextDouble();
        double reais = dol / 0.2;
        System.out.println("Dol: " + dol);
        System.out.println("Reais: " + reais);
    }
}
