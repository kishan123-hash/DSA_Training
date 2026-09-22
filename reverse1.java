import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inputNum = sc.nextInt();
        String a = String.valueOf(inputNum);
        String reversedStr = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + a.charAt(i); 
        }
        int reverse = Integer.parseInt(reversedStr);
        System.out.println("Reversed number: " + reverse);
    }
}

