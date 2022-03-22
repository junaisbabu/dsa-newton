package ImportantQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int [] arr = new int [] {4, 2, 3, 4, 2, 4, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);

            }
        }


    /*
        Set<Integer> set = new HashSet<>();
        boolean flag = false;
        for(int l : arr) {
            if(set.add(l) == false) {
                System.out.println("Duplicate elment : " + l);
                flag = true;
            }
        }

        if(flag == false)
            System.out.println("Not found");
    */
    }
}
