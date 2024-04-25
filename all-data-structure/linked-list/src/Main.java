import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pear");
        list.add(1,"mango");
        list.removeFirst();
        System.out.println(list);

        // synchronized linked list
        List<String>  syncList = Collections.synchronizedList(list);
        System.out.println(syncList);
    }
}




























