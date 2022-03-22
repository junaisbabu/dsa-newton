package NewtonSchoolAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestDifference {
    static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int lo = 0;
        int hi = nums[nums.length - 1] - nums[0];
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            int count = 0, left = 0;
            for (int right = 0; right < nums.length; ++right) {
                while (nums[right] - nums[left] > mi) left++;
                count += right - left;
            }
            //count = number of pairs with distance <= mi
            if (count >= k) hi = mi;
            else lo = mi + 1;
        }
        return lo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j, n, k;
        int t = input.nextInt();
//        int a[] = {1, 6, 1};
        for(i=0; i<t; i++) {
            n = input.nextInt();
            k = input.nextInt();
            int arr[] = new int[n];
            for(j=0; j<n; j++) {
                arr[i] = input.nextInt();
            }
            int result = smallestDistancePair(arr, k);
            System.out.println(result);
        }


    }
}
