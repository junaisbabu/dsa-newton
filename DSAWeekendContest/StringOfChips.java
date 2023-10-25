package DSAWeekendContest;

import java.util.Scanner;

public class StringOfChips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "chips";

        String str = sc.next();
        int count = 0;
        int j = 0;
        for(int i = 0; i < str.length(); i++) {
            if(j < s.length()) {

                if (str.charAt(i) != s.charAt(j)) {
                    count++;
                }

                j++;
            }
            else {
                i --;
                j = 0;
            }
        }

        System.out.println(count);
    }
}
