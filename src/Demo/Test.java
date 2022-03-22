package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

//        for(int i = 0; i < n; i++) {
//            System.out.println(str[i]);
//        }

        String ph = "eklpyqrbgjdwtcaxznsifvhmou";

        int index[] = new int[n];

        for(int i = 0; i < n; i++) {
            char ch = str[i].charAt(0);
            index[i] = ph.indexOf(ch);
            System.out.println(index[i]);
        }

        Arrays.sort(index);
        /*

        for(String i : str) {
            ph.startsWith(i) == index
        }

        */


    }

}
