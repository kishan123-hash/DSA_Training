import java.util.Scanner;

public class code215A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean found = false;
        
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] * arr[j] == 67 ) {
                    found = true;
                    break; 
                }
            }
            if(found){
                break;
            }
        }
        
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
