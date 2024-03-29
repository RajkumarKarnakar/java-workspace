import java.util.*;


public class Application {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Room("Pune","Suite",6,250.0));
        c.add("rajkumar");
        c.add(1212);
        int i=5;

        System.out.println();

        String first = "Interpolation";
        String second = "Java";
        String result = String.format("String %s in %s with some %2$s examples.", "Rajkumar", "Karnakar");
        System.out.println(result);




    }
}
