import java.util.Scanner;

public class bact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        String bit = Long.toBinaryString(t);
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
