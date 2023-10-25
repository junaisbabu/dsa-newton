package OwnEffect;

public class PalindromeExample1 {

        static boolean findPalindrome(String str, int s, int e) {

            boolean isPalindrome = true;

            if(s == e - 1) {
                return true;
            }
            else {
                if(str.charAt(s) != str.charAt(e - 1)) {
                    return false;
                }
            }

            if(s < e)
                findPalindrome(str, s + 1, e - 1);

            return isPalindrome;
        }

    public static void main(String[] args) {
            String str = "hello";

            int s = 0;
            int e = str.length();

            boolean isPalindrome = findPalindrome(str, s, e);

            if(isPalindrome)
                System.out.println("Palindrome");

            else
                System.out.println("Not a palindrome");
    }
}
