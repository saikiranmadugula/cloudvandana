import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman number: ");
        String romanNum = sc.nextLine().toUpperCase(); // Convert input to uppercase, because all romans are uppercase only.
        // We use try catch block to avoid runtime exception. when a user gives wrong input
        try { 
            int intRoman = romToInt(romanNum);
            System.out.println("Converted Roman number as Integer: " + intRoman);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Roman number input.");
        }
    }

    public static int romToInt(String romanNum) {
        // Declare a Hashmap which stores key,value pairs.
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) {
            int currValue = map.getOrDefault(romanNum.charAt(i), 0); //getOrDefault is a method of map interface.

            if (currValue == 0) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanNum.charAt(i));
            }

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}
