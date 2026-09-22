import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int b = 1;
        while (b <= a) {
            if (a % b == 0) {
                count++;
            }
            b++;
        }
        if (count == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}