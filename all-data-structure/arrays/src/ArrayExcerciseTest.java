import org.junit.Test;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayExcerciseTest {
    ArrayExcercise arrayExcercise = new ArrayExcercise();

    @Test
    public void testArrayToUpperCase(){
        String[] input = new String[] {"cat","dog","fish"};
        arrayExcercise.arrayToUpperCase(input);
        assert(Arrays.equals(input,new String[] {"CAT","DOG","FISH"}));
    }
    @Test
    public void testIncrementArray(){
        int[] input = new int[] {1,2,3,4,5};
        arrayExcercise.incrementArray(input);
        assert(Arrays.equals(input,new int[] {2,3,4,5,6}));
    }
}
