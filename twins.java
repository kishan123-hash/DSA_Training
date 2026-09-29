import java.util.Scanner;
import java.util.Arrays;

public class twins {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;
        int coinsum = 0;
        int coins = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {

            coinsum += arr[i];
            coins++;

            if (coinsum > total / 2) {
                break;
            }
        }

        System.out.println(coins);
    }
}