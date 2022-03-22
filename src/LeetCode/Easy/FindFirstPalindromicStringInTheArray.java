/*
package LeetCode.Easy;



public class FindFirstPalindromicStringInTheArray {
    public static String firstPalindrome(String[] words) {

        int n = words.length;
        StringBuilder[] sb = new StringBuilder[n];

        for(int i = 0; i < n; i++) {
            String rev = new StringBuilder().reverse().toString();
            sb[i] = new StringBuilder(rev);
        }
        String palindrome = "";
        for(int i = 0; i < n; i++) {
            String strr = new String(sb[i]);
            System.out.println(strr);
            if(words[i] == strr) {
                palindrome = strr;
                return palindrome;
            }
        }

        return palindrome;
    }

    public static void main(String[] args) {
        String s[] = {"junais", "ada", "goal", "football"};

        System.out.println(firstPalindrome(s));

    }
}
*/
