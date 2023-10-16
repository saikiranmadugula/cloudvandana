import java.util.HashSet;

public class PangramChecker {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps the lazy dog over "; // giving a sentence by default
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        HashSet<Character> letters = new HashSet<Character>(); // declare a hashset because it accept unique values.
        String lowerCaseSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char ch = lowerCaseSentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        return letters.size() == 26;
    }
}
