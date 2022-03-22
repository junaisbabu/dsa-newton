package Mock;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindDuplicateNumbersUsingHashSet {
    public static void main(String[] args) {

        int arr[] = {44, 22, 55, 55, 22, 7, 34, 44};
/*

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print(arr[arr.length - 1]);

*/


        HashSet<Integer> set = new LinkedHashSet<>();

        for(int i : arr) {

            if(set.contains(i)) {
                System.out.println(i);
            }

            set.add(i);
        }

        System.out.println(set);
    }
}
