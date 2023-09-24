import task.Tarefa;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        boolean flag = true;

        while(flag){
            System.out.println("-----------------");
            System.out.println("1- criar tarefa");
            System.out.println("2- listar tarefas");
            System.out.println("-----------------");


            if(Objects.equals(scanner.nextInt(), 1)){
                Tarefa task = new Tarefa();
                int dia, mes, ano;
                scanner.nextLine();
                System.out.println("Titulo da task: ");
                task.setTitulo(scanner.nextLine());
                System.out.println("Dia: ");
                dia = scanner.nextInt();
                System.out.println("Mes: ");
                mes = scanner.nextInt();
                System.out.println("Ano: ");
                ano = scanner.nextInt();
                task.setData(dia, mes, ano);
                scanner.nextLine();
                System.out.println("Descricao: ");
                task.setDescricao(scanner.nextLine());

                tarefas.add(task);
            }else{
                for(Tarefa tarefa : tarefas){
                    System.out.println("====================");
                    System.out.printf("=     %s      =\n", tarefa.getTitulo());
                    System.out.println("====================");

                    System.out.println("Data: " + tarefa.getData());
                    System.out.println("Descricao: " + tarefa.getDescricao());

                }
            }


        }

    }
}
