package OwnEffect;

/*
print the sum of all the +ve integers from an array A={12,34,-20,44,-10,56,-2,86,12}.
 */

public class Print {
    public static void main(String[] args) {

        int A[] = {12, 34, -20, 44, -10, 56, -2, 86, 12};
        int sum = 0;
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] >= 0 && count < 3) {
                sum = sum + A[i];
                count += 1;
            }
        }
        System.out.println(sum);
    }
}
