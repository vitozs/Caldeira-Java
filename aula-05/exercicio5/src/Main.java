import arquivo.Arquivo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Arquivo> impressora = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1- Adicionar documento a fila ");
            System.out.println("2- Imprimir documento");

            int opt = scanner.nextInt();

            if(opt == 1){
                System.out.println("Nome do arquivo (sem espacos): ");
                String nomeArquivo = scanner.next();
                System.out.println("N de folhas: ");
                int numeroFolhas = scanner.nextInt();
                Arquivo arquivo = new Arquivo(nomeArquivo, numeroFolhas);
                impressora.add(arquivo);
            }else if(opt == 2 && !impressora.isEmpty()){
                System.out.println("Iniciando a impressao do arquivo " + impressora.getLast().getNome());
                System.out.println("N de folhas: " + impressora.getLast().getFolhas());
                impressora.removeLast();
                TimeUnit.SECONDS.sleep(4);
                System.out.println("Impressao concluida");
            }
        }
    }
}
