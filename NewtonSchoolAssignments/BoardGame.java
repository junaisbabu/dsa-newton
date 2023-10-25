package NewtonSchoolAssignments;

import java.util.Scanner;

public class BoardGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int C = A*6;

        if(C >= B && A <= B) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

// A = 6
// B = 30

// c = 6*6

//    if (36 >= 30  && 6 <= 30) {
//      sout("Yes");
//    else
//       sout("No");


