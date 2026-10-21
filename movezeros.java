import java.util.Arrays;

public class movezeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zeros] = arr[i];
                zeros++;
            }
        }
        while (zeros < arr.length) {
            arr[zeros] = 0;
            zeros++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
