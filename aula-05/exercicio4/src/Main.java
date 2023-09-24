import compra.Compra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Compra> carrinho = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("-------------------------");
            System.out.println("1- Adicionar ao carrinho");
            System.out.println("2- remover do carrinho");
            System.out.println("3- Listar");
            System.out.println("-------------------------");

            int opt = scanner.nextInt();

            if(opt == 1){
                Compra compra = new Compra();
                scanner.nextLine();
                System.out.println("Nome do produto: ");
                compra.setNome(scanner.nextLine());
                System.out.println("Data de validade (dd/mm/yyyy): ");
                compra.setDataDeValidade(scanner.next());
                carrinho.add(compra);
            }else if(opt == 2){
                System.out.println("Selecione o numero do produto que deseja remover: ");
                for (Compra compra : carrinho){
                    System.out.println(carrinho.indexOf(compra) + " - " + compra.getNome() + " " + compra.getDataDeValidade());
                }
                System.out.print("\n Produto: ");
                carrinho.remove(scanner.nextInt());
            }else if(opt == 3){
                System.out.println("=====================");
                System.out.println("   P R O D U T O S   ");
                System.out.println("=====================");
                for (Compra compra : carrinho){
                    System.out.println(carrinho.indexOf(compra) + " - " + compra.getNome() + " " + compra.getDataDeValidade());
                }

            }
        }
    }
}
