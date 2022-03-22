package ImportantQuestions;

public class FindMissingNumberInArray {

        static int missingNumber(int[] nums) {
            int sumArr = 0;
            for(int i : nums) {
                sumArr += i;
            }

            int n = nums.length;
            int sumAll = n * (n + 1) / 2;

            return (sumAll - sumArr);
        }


    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 0, 5, 6, 1};
        int mNumber = missingNumber(arr);
        System.out.println("Missing Number is : " + mNumber);
    }
}
