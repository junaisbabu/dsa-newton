package LeetCode.Easy;

public class ShuffleTheArray {
    public static void shuffle(int[] nums, int n) {
        int length = nums.length;
        int arr[] = new int[length];
        int j = 1;
        arr[0] = nums[0];
        for(int i = 1; i < length; i++) {
            if(i % 2 == 0) {

                arr[i] = nums[j];
                j ++;
            }
            else {
                arr[i] = nums[n];
                n ++;
            }
        }

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 4, 7};

        shuffle(arr, 3);
    }
}
