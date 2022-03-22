package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()) {
            System.out.println("Not anagram");
            System.exit(0);
        }



        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                System.out.println("Not anagram");
                System.exit(0);
            }
        }

        System.out.println("Anagram");


    }
}
