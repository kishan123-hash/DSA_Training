import java.util.Scanner;
public class palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int org=a;
        int reverse = 0;
        
        while(a > 0){
            int last = a % 10;          
            reverse = (reverse*10)+ last; 
            a = a / 10;                 
        }
        System.out.println("Reversed number: " + reverse);

        if(org==reverse){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
