package NewtonSchoolAssignments;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char a = input.next().charAt(0);
        char b = input.next().charAt(0);

        if(a=='R' || b=='R') {
            System.out.print("R");
        } else if(a=='J') {
            System.out.print(b);
        } else if(b=='J') {
            System.out.print(a);
        } else if(a!='R'  || b!='R' || a!='J' || b!='J') {
            System.out.print("D");
        }

    }
}
