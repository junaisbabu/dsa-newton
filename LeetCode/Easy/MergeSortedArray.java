package LeetCode.Easy;

public class MergeSortedArray {
    public static boolean containsDuplicate(int[] nums) {
        int i = 0;
        int j = i + 1;
        for(i = 0; i < nums.length; i++) {
            if(j < nums.length) {

                if(nums[i] == nums[j]) {
//                    System.out.println(nums[i] + " " + nums[j]);
                    return true;
                }

                j ++;
                i --;
            }
            else {
                j = i + 2;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1};

        System.out.println(containsDuplicate(arr));
    }
}
