package NewtonSchoolAssignments;

import java.util.Scanner;

public class SPDEmergencyContest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();
        int p5 = sc.nextInt();

        if((p1<p2+p3+p4+p5)&&
                (p2<p1+p3+p4+p5)&&
                (p3<p1+p2+p4+p5)&&
                (p4<p1+p2+p3+p5)&&
                (p5<p1+p2+p3+p4)){
            System.out.println("Stable");
        }else{
            System.out.println("SPD Emergency");
        }
    }
}
