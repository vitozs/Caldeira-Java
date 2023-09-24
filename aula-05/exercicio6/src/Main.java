import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Reserva> reservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1- Fazer reserva");
            System.out.println("2- Cancelar reserva");
            System.out.println("3- Listar reservas");
            int opt = scanner.nextInt();

            if(opt == 1){
                scanner.nextLine();
                Reserva reserva = new Reserva();
                System.out.println("Nome: ");
                reserva.setNome(scanner.nextLine());
                System.out.println("Local: ");
                reserva.setNome(scanner.nextLine());
                System.out.println("Cpf: ");
                reserva.setCpf(scanner.nextInt());
                reservas.add(reserva);
            }else if(opt == 2){
                System.out.println("Selecione a reserva que deseja cancelar: ");
                for (Reserva reserva : reservas){
                    System.out.println(reservas.indexOf(reserva) + "- " + reserva.getNome() + " " + reserva.getCpf());
                }
                System.out.print("\nSelecionar: ");
                reservas.remove(scanner.nextInt());
                System.out.println("Cancelado com sucesso!");
            }else if(opt == 3){
                for (Reserva reserva : reservas){
                    System.out.println(reservas.indexOf(reserva) + "- " + reserva.getNome() + " " + reserva.getCpf() + " " + reserva.getLocal());
                }
            }
        }
    }
}
