package Mock;

import java.util.Scanner;

public class StringPalindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean isPalindrome = true;

        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt((str.length() - i - 1))) {
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
