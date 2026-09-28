import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean present=false;
        int [] arr = new int[100];
        for (int i=0; i<5; i++){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Element in the array is: ");
        for (int j=0; j<5; j++){
            System.out.print(arr[j]+",");
        }
        System.out.println("\n");
        System.out.println("The length is: "+arr.length);

        System.out.print("Enter the number to search: ");
        int a = sc.nextInt();
        for (int k=0; k<5; k++){
            if (arr[k] == a) { 
                present = true;
                break;
            }
        }
        if(present){
            System.out.println("Present ");
        }
        else{
            System.out.println("Not present");
        }
    }
}