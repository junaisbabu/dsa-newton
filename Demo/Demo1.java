package Demo;

import java.util.Scanner;

public class Demo1 {
    public static void main (String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();

        StringBuffer stringBuffer = new StringBuffer("");

        int maxLength = 0;

//        char arr1[] = new char[str1.length()];
//        char arr2[] = new char[str2.length()];

        char[] ch1 = str1.toCharArray();

        char[] ch2 = str1.toCharArray();

        int j = 0, count = 0;
        for(int i = 0; i < maxLength; i++) {

            while (ch1[i] != ch2[j]) {
                stringBuffer.append(j);
                j++;

                System.out.println(j);
            }

            }



    }
}
