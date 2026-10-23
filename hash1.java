import java.util.HashMap;

public class hash1 {
    public static void main(String[] args){
        HashMap<Integer,Integer>map=new HashMap<>();
        // Insertion in Hashmap;
        map.put(1,1000);
        map.put(2,2000); // put function is used to insert data in the form of key and value in the hashmap
        map.put(3,3000);
        System.out.println(map);

        // Access element in Hashmap
        System.out.println(map.get(2));

        // update the value in the Hashmap
        System.out.println("Before change: "+map.get(2));
        map.put(2,5000000);
        System.out.println("After change: "+map.get(2));

        // Remove element from Hashmap
        map.remove(3);
        System.out.println(map);
    }
}
