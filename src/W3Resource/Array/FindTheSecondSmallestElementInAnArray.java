package W3Resource.Array;

import java.util.Arrays;

public class FindTheSecondSmallestElementInAnArray {

    public static void main(String[] args) {
        int[] my_array = {-1, 4, 0, 2, 7, -3};
        System.out.println("Original numeric array : "+ Arrays.toString(my_array));
        int min = Integer.MAX_VALUE;
        System.out.println("Min " + min);
        int second_min = Integer.MAX_VALUE;
        System.out.println("Second_Min " + second_min);
        for (int i = 0; i < my_array.length; i++) {
            if(my_array[i]==min){
                second_min=min;
                System.out.println("sm " + second_min);
            } else if (my_array[i] < min) {
                second_min = min;
                min = my_array[i];
                System.out.println("mn " + min);
            } else if (my_array[i] < second_min) {
                second_min = my_array[i];
                System.out.println("sml " + second_min);
            }

        }
        System.out.println("Second lowest number is : " + second_min);
    }
}
