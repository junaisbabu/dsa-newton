/*
package LeetCode.Easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        char arr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        char ch = ' ';
        Set<Character> set = new HashSet<>();

        for(char i : arr) {
            set.add(i);
        }

        for(char j : tArr) {
            if (sLen < tLen) {
                if (!set.contains(j)) {
                    return j;
                }
                set.add(j);
            } else {
                if (set.contains(j)) {
                    return j;
                }
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(findTheDifference(s, t));
    }
}
*/
