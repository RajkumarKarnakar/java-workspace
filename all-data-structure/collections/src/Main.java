import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.format("some of %s are ","methods of collection");
        Arrays.stream(new String[]{"add()","clear()","size()","remove()","isEmpty","contains()"}).forEach(System.out::println);
    }
}