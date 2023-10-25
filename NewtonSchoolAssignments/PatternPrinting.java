package NewtonSchoolAssignments;

public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){

                System.out.print(k+" ");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(j+" ");
            }
            for(int j=n-(i+1); j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
