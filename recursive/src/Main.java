import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("-------------------------After reverse ----------------");
        reverse(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::print);
    } public static void reverse(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }
    
}