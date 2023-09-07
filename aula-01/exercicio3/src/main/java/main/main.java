package main;

class finder{
    public static void maiorMenor(int[] nums){
        int maior = 0, menor = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    maior = nums[i];
                }
                if(nums[i] < maior){
                    menor = nums[i];
                }

            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
    public static void media(int[] nums){
        int total = 0;
        for(int num:nums){
            total += num;
        }
        System.out.println("Media: " + total/nums.length);
    }
}
public class main {
    public static void main(String[] args) {
        int[] nums = {4,6,2,0};
        finder.maiorMenor(nums);
        finder.media(nums);
    }

}
