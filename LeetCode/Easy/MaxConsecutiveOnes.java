package LeetCode.Easy;

public class MaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int[] nums) {
        int consecutive1s = 0;

        int minNum = 0;
        int maxNum = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive1s++;


            } else {

                temp = consecutive1s;


                if (temp > maxNum)
                    maxNum = consecutive1s;
                else
                    minNum = consecutive1s;


                consecutive1s = 0;
            }
        }


        return maxNum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};

        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
