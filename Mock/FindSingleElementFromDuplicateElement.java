package Mock;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindSingleElementFromDuplicateElement {

    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++) {
//            System.out.print(res + " ^ " + ar[i]);
            res = res ^ ar[i];
//            System.out.println(" = " + res);

//            System.out.println();
        }
        return res;
    }

    // Driver code
    public static void main (String[] args)
    {
        int ar[] = {5, 3, 5, 4, 2, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");
    }
}
