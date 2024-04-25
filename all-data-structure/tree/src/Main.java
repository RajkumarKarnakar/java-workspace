import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(200);
        treeSet.add(38);
        treeSet.add(400);
        treeSet.add(50);

        System.out.println(treeSet);

//        Set<String> wordSet = new TreeSet<>();
        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        wordSet.add("butterfly");
        /*
        the comparator is comparing
        on the basis
        of string length
        therefor it consider wolf has duplicate value
       */
        wordSet.add("wolf");

        System.out.println(wordSet);

        wordSet.remove("butterfly");
        System.out.println(wordSet);


    }
}





