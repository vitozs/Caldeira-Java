import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite dois numeros inteiros");
            System.out.println("1: ");
            scanner.nextInt();
            System.out.println("2: ");
            scanner.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Digite dois numeros INTEIROS, nao sabe oq é não??");
        }
    }
}
