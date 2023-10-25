package Mock;

public class FindMinAndMaxValueInAnArray {
    public static void main(String[] args) {
        int arr[] = {3, 8, 2, 4, 6, 10};
        int maxNum = arr[0];
        int minNum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minNum) {
                minNum = arr[i];
            }
            else if(arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        System.out.println("Minimum " + minNum);
        System.out.println("Maximum " + maxNum);
    }
}
