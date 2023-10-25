package NewtonSchoolAssignments;

public class RecursionComputePower {
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 9;
        int P = 9;

        System.out.println(power(N, P));
    }
}
