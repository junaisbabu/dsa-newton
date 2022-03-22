package Mock;

import java.util.Locale;
import java.util.Scanner;

public class FindCapitalLetterOrLowerCase {
//    Example :
//    Abhishek sawant --> Abhishek SAWANT
//    abhishek Sawant--> ABHISHEK Sawant
//    Abhishek Sawant --> ABHISHEK SAWANT



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A --> Z    65 --> 90


            String str = sc.nextLine(); // nextLine we can put ' '.
            System.out.println("Before: \n" + str);
            String[] newStr = str.split(" ", 2);


            String s1;
            String s2;

            s1 = newStr[0];
            s2 = newStr[1];

            System.out.println("After: ");

            if ( ( s1.charAt(0) >= 65 && s1.charAt(0) <= 90 ) && ( s2.charAt(0) >= 65 && s2.charAt(0) <= 90 ) )
                System.out.println(s1.toUpperCase(Locale.ROOT) + " " + s2.toUpperCase(Locale.ROOT));

            else if ( s1.charAt(0) >= 65 && s1.charAt(0) <= 90 )
                System.out.println(s1 + " " + s2.toUpperCase(Locale.ROOT));

            else if ( s2.charAt(0) >= 65 && s2.charAt(0) <= 90 )
                System.out.println(s1.toUpperCase(Locale.ROOT) + " " + s2);



    }
}
