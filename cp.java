import java.util.Scanner;

public class cp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int primecount = 0;
        int compositecount = 0;

        while (n > 0) {

            int digit = n % 10;
            int count = 0;

            for (int i = 1; i <= digit; i++) {
                if (digit % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                primecount++;
            } 
            else if (count > 2) {
                compositecount++;
            }

            n = n / 10;
        }

        System.out.println("Prime count: " + primecount);
        System.out.println("Composite count: " + compositecount);
    }
}