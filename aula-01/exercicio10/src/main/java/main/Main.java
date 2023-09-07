package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double grausC = scanner.nextDouble();
        double grausF = (grausC * 9/5) + 32;
        System.out.println(grausF + "F");
    }


}
