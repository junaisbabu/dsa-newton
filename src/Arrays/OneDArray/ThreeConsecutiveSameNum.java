package Arrays.OneDArray;
import  java.util.Scanner;
public class ThreeConsecutiveSameNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];

        int i, j, count=0;

//        for(i=0; i<A.length; i++) {
//            A[i] = input.nextInt();
//        }
//
//        for(i=0; i<A.length; i++) {
//            for(j=i+1; i<A.length; j++) {
//                if(A[i] == A[j]) {
//                    count = count + 1;
//                }
//            }
//        }
//        if(count == 3) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

        for(i=0; i<N; i++) {
            A[i] = input.nextInt();
        }

        for(i=0; i<N; i++) {
            if(A[i] == A[i+1]) {
                count = count + 1;
            }
        }

        if(count == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
