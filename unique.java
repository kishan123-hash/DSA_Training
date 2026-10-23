import java.util.*;
public class unique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
