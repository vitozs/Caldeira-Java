import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.println("Digite o " + (i+1) + " numero");
            arr[i] = scanner.nextInt();
        }

        for (int num : arr){
            total += num;
        }

        System.out.println("Total: " + total);
        System.out.println("Media: " + (total/arr.length));
    }
}
