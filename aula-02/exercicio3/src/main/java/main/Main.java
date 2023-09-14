package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do{
            System.out.println("1- Deficiente");
            System.out.println("2- Gestante");
            System.out.println("3- Idosa");
            System.out.println("4- Nenhuma das alternativas");

            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();
            if(!(opt == 1 || opt == 2 || opt == 3 || opt == 4)){
                continue;
            }
            if(opt == 4){
                System.out.println("Voce nao tem direito a fila prioritaria!!!!");
            }else{
                System.out.println("Voce tem direito a fila prioritaria!!!!");
            }

        }while (true);

    }
}

