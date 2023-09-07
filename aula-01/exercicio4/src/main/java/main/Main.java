package main;

import java.util.Scanner;

class salario{
     double salario = 1320;
    public static void qtdSalarios(double salarioUsuario){
        if(salario < salarioUsuario){
            System.out.println("Voce recebe menos que um salario minimo!");
        }else{
            double qtd = salario/salarioUsuario;
            System.out.println("Voce recebe " + qtd + " salarios minimos");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salarioUsuario = scanner.nextDouble();
        salario.qtdSalarios(salarioUsuario);
    }
}
