package NewtonSchoolAssignments;

public class EachMuliplication {

    public static void main(String[] args) {
        int n=10, i;

        for( i = 1 ; i<=n; i++) {
            if(i %3 == 0) {
                System.out.println("Newton");
            } else if (i % 5 == 0) {
                System.out.println("school");
            } else {
                System.out.println(i);
            }
        }
    }
}
