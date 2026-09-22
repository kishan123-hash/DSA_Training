import  java.util.Scanner;
public class weight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total money: ");
        int n=sc.nextInt();
        System.out.println("Enter total number of bananas: ");
        int w=sc.nextInt();
        System.out.println("Enter the amount of one banana: ");
        int k=sc.nextInt();
        int money=0;
        for (int  i=1; i<=w; i++){
            money=money+k*i;
        }
        int borrow=(money-n);
        if (borrow<0){
            System.out.println("0");
        }
        else{
             System.out.println("The borrow money is: "+borrow);
        }

    }
}