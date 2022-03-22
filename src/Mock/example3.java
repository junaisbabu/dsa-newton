package Mock;

import java.lang.reflect.Array;
import java.util.Arrays;

public class example3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 6, 7};

        String str = "24867";

        int index = -1;
        int target = 6;


        System.out.println(str);

        index = str.indexOf(target);

        if(index == -1) {
            System.out.println(-1);
        }
        else {
            System.out.println(index);
        }
    }
}
