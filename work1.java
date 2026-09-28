import java.util.Arrays;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] k = {10,43,65,23};
        
        System.out.println("Array: " + Arrays.toString(k));
        
        int max = k[0];
        int sec = k[0];
        int min = k[0];
        
        for (int i = 1; i < k.length; i++) {
            if (k[i] > max) {
                max = k[i];
            }
            if (k[i] < min) {
                min = k[i];
            }
            if(k[i]>min && k[i]<max){
                sec = k[i];
            }
        } 
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Second largest: "+sec);
    }
}
