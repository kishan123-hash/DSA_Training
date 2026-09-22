import java.util.Scanner;
public class bitwise {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0 & a>2){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
