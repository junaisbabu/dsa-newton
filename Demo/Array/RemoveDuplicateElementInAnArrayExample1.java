package Demo.Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementInAnArrayExample1 {
    public static void main(String[] args) {
        int arr[] = {12, 35, 2, 12, 65, 2};

        Set<Integer> set = new LinkedHashSet<>();

        for(Integer i : arr) {

            set.add(i);
        }

        System.out.println(set);


    }
}
