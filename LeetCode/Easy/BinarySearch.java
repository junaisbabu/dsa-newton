package LeetCode.Easy;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                index = mid;
                return index;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int k = 12;

        System.out.println(search(arr, k));
    }
}
