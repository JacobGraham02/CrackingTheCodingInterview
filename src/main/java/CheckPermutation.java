import java.util.Arrays;
import java.util.Collections;

public class CheckPermutation {
    // Given two strings, write a method to decide if one is a permutation of the other

    /**
     *
     * @param unsortedStr
     * @return
     * Time complexity: O(2n), drop the constant, and you get O(n)
     * First, create a sort method which does the following:
     *  1. Create a char array from an already existing string
     *  2. Next, call the Arrays.sort static method on the newly created char array
     *  3. Convert this char array into a string
     *
     * Next, create a permutation method which does the following:
     *  1. Takes 2 arguments in the form of Strings
     *  2. Calls the static sort method on both Strings and takes the equality of both
     */
    private static String sort(final String unsortedStr) {
       char[] chars = unsortedStr.toCharArray();
       Arrays.sort(chars);
       return new String(chars);
    }

    public static boolean permutation(final String str1, final String str2) {
        return sort(str1).equals(sort(str2));
    }


    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] word : pairs) {
            String str1 = word[0];
            String str2 = word[1];
            System.out.println(permutation(str1, str2));
        }
    }
}
