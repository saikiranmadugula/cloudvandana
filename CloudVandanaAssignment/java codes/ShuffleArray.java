import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7}; //Declare a array
        shuffleArray(array);
        System.out.println(Arrays.toString(array));
    }

    // Method to shuffle the array using Collections.shuffle() method
    public static void shuffleArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);  // Convert array to list
        Collections.shuffle(list);  // Shuffle the list
        list.toArray(array);  // Convert list back to array
    }
}
