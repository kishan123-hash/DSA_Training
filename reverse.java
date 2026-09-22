import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int reverse = 0;
        
        while(a > 0){
            int last = a % 10;     
            reverse = (reverse * 10) + last; 
            a = a / 10;                 
        }
        
        System.out.println("Reversed number: " + reverse);
    }
}
