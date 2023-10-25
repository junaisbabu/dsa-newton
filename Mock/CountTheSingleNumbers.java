package Mock;

import java.util.Arrays;

public class CountTheSingleNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 7, 4, 2, 3, 3, 8, 1, 8, 9};

        Arrays.sort(arr); // 1, 1, 2, 3, 3, 4, 7, 8, 8, 9    ----------------> 4 unique elements
        int count = 0;
        int lengthOfArr = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count += 2;
            }
        }

        lengthOfArr = arr.length;
        int uniqueElementsCount = lengthOfArr - count;

        System.out.println(uniqueElementsCount);
    }
}
