import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        //Popula o array com numeros aleatorios de 1 a 100
        for (int i =0; i < arr.length; i++){
            int num = (int) (Math.random() * (100-1)) + 1;

            if(num > 0 && num <= 100){
                arr[i] = num;
            }
        }

        boolean flag = true;
        do{
            System.out.println("Digite um numero: ");
            int num = scanner.nextInt();

            for (int arrN : arr){
                if(num == arrN){
                    System.out.println("Acertou!");
                    flag=false;
                }else{
                    System.out.println("Errou!");
                }
                break;
            }


        }while (flag);



    }
}
