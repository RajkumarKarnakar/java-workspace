import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] a = new int[]{1, 2, 3,3, 4, 5};
        Arrays.stream(a).forEach(System.out::print);;
        System.out.format("...................... %s", Arrays.toString(a));


    }
    public static List<Integer> removeDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int j : a) {
            set.add(j);
        }
        return new ArrayList<>(set);
    }
}