package OwnEffect;

public class RecursionPatternPrinting {

    static int pattern1(int n) {

        if( n == 2 )
            return 1;
        while ( n > 2) {

            System.out.println(n+ " ");
            n++;
        }

        return pattern1(n - 1);
    }



    public static void main(String[] args) {
        int n = 5;
        System.out.println(pattern1(n));

    }
}
