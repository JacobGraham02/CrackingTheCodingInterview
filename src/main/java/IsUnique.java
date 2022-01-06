public class IsUnique {
    // Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    /**
     * O(1) - Same amount of time regardless of input size
     * O(log n) - Takes space proportional to the log of the input size
     * O(n) - Takes space directly proportional to the input size
     * O(n log n) - Space complexity grows proportionally to the input size and logarithmic factor
     * O(n^2) - Space complexity grows proportionally to the square of the input size
     */

    /**
     * Loop over string required to determine if each char is unique or not.
     * Set the starting character as the first char in the string
     * Loop through the entire string after setting the first char, checking each character if it's equal to the currently stored one.
     * Time complexity: O(n-1) because looping over a String of size n, excluding the first character. However, we only take into account O(n), and not a constant
     * Space complexity: O(n) because storing a String of size n
     * @param str input string to test for unique characters
     */
    public static boolean isUniqueString(final String str) {
        char firstCharOfString = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == firstCharOfString) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"helloh", "aaaa", "ogresLOvg", "James"};
        for (String word : words) {
            System.out.println(word + " is " + isUniqueString(word));
        }
    }
}
