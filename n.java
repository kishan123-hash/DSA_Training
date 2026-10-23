import java.util.HashMap;
import java.util.Scanner;
public class n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int k=0; k<n; k++){
            if(map.containsKey(arr[k])){
                map.put(arr[k],map.get(arr[k])+1);
            }
            else{
                map.put(arr[k],1);
            }
        }
        System.out.println(map);
    }
}
