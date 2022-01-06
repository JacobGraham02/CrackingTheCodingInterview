import java.util.Arrays;

public class URLify {
    // Write a method to replace all spaces in a string with %20. You may assume the string has sufficient space at the end to hold the additional characters,
    // and that you are given the true length of the string. Please use a char array so you can perform operation in place
    // Performing an operation in-place means modifying the original variable, and not using any additional memory space.

    private static String UrlifyRegex(final String str1) {
        return str1.trim().replaceAll(" ", "%20");
    }

    /**
     * First, convert the argument String into a char array
     * Next, you have to find in which locations in the array there are blank space characters, and set the next 3 locations as the '%', '2', '0' characters.
     * Do not forget to shift all the indexes over to make space for the new white space character
     * When you encounter a white space character, immediately set that location as '%', and the next 2 indexes as '2' and '0' respectively.
     * @param str1
     * @return
     */
  /*  private static String UrlifyWithoutRegex(final String str1) {
        char[] chars;
        char[] tempChars;
        chars = str1.toCharArray();
        tempChars = new char[str1.length()];
        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i] = '%';
                chars[i+1] = '2';
                chars[i+2] = '0';
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(tempChars));
        return "";
    }*/

    public static void main(String[] args) {
        String test = "Mr John Smith ";
        String test2 = "Mr John Smith      ";
        System.out.println(UrlifyRegex(test2));
    }
}
