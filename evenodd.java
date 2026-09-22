import java.util.Scanner;

public class evenodd{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int even = 0;
        int Odd = 0;

        while (n > 0) {

            int digit = n % 10;
            while(n>0){
                if(digit%2==0){
                    even++;
                }
                else{
                    Odd++;
                }
            }
            n = n / 10;
        }

        System.out.println("Prime count: " + even);
        System.out.println("Composite count: " + Odd);
    }
}