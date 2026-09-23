import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cordinates: ");
        int a = sc.nextInt();
        int sumx=0;
        int sumy=0;
        int sumz=0;
        for (int i=0; i<a; i++){
            System.out.println("Enter x: ");
            int x=sc.nextInt();
            System.out.println("Enter y: ");
            int y=sc.nextInt();
            System.out.println("Enter z: ");
            int z=sc.nextInt();
            sumx = sumx+x;
            sumy = sumy+y;
            sumz = sumz+z;
        }
        if(sumx==0&&sumy==0&&sumz==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
