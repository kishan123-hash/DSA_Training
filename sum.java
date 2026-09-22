import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Id:");
        int a=sc.nextInt();
        int total=0;
        while(a>0){
            int digit=a%10;
            total=total+digit;
            a=a/10;
        }
        System.out.print("The total sum is:"+total);
    }
}
