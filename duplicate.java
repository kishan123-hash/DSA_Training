import java.util.Scanner;
public class duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,1};
        boolean found=false;
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
        }
        if(found){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}