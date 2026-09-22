import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b=0;
        int step=0;
        do{
            b=b+5;
            step++;
        }
        while(b<=a);
        System.out.println("The steps are: "+step);
    }
}

