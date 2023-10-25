/*
package LeetCode.Easy;

public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        int n = s.length();
        boolean boolVal = true;
        for(int i = 0; i < n; i++) { // deeee - eeeed
            if(s.charAt(i) != rev.charAt(i)) {
                if(s.charAt(i) == rev.charAt(i + 1)) {
                    return true;
                }
                else {
                    return false;
                }

            }

        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aa";

        System.out.println(validPalindrome(s));

    }
}


// d e e e e
// e e e e d
*/
