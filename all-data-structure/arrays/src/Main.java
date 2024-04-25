import java.io.Console;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        /*weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        System.out.println(Arrays.toString(weekdays));*/

        weekdays = new String[]{"Monday", "Tuesday", "Wednesday"};



        for (String day : weekdays) {
            // here day is a copy from weekdays so alerting day will not affect original
            day = day.toUpperCase();
            System.out.println("Day: " + day);
        }

        System.out.println(Arrays.toString(weekdays));
    }
}














