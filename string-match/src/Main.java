public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println(stringMatch("hello", "h"));
    }
    public static boolean stringMatch(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else if (str1.length()>str2.length()) {
            return str1.contains(str2);
        }
        return str2.contains(str1);


    }
}