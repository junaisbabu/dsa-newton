package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        String str;
        for(int i = 1; i <= n; i++) {
            if(i <= 2) {
                str = Integer.toString(i);
                list.add(str);
            }
            else if(i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                list.add("Fizz");

            }
            else if(i % 5 == 0) {
                list.add("Buzz");
            }
            else {
                str = Integer.toString(i);
                list.add(str);
            }

        }


        return list;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fizzBuzz(n));

    }

}
