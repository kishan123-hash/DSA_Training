import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean has67 = false;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 67) {
                    has67 = true;
                }
            }
            
            if (has67) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
