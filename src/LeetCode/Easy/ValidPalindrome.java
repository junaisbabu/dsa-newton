package LeetCode.Easy;

import java.util.Arrays;
import java.util.Locale;

// 97 >> 122 --> lowercase

// 65 >> 90 --> Uppercase

// 48 >> 57 --> Numbers

public class ValidPalindrome {

    static boolean findPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 48 && s.charAt(i) <= 57))
                str.append(s.toLowerCase(Locale.ROOT).charAt(i));
        }

        String newStr = str.toString();

//        System.out.println(newStr);

        int length = newStr.length();



        for(int i = 0; i < length / 2; i++) {
            if(newStr.charAt(i) != newStr.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
//      String s = "A man, a plan, a canal: Panama";

        String s = "0P" ;
        boolean boolVal = findPalindrome(s);

        if(boolVal)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
