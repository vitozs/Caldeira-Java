import enums.DiaSemana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva um dia da semana (sem '- feira'): ");
            String d = scanner.next();
            String D = d.toUpperCase();
            for(DiaSemana dia : DiaSemana.values()){
                if(D.equals(dia.name())){
                    System.out.println("Voce escolheu " + dia.name());
                    break;
                }
            }

        }catch (Exception e){
            System.err.println("Algo deu errado! " + e);
        }
    }
}
