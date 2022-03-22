package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 18, 19, 23, 30, 89, 100};
        int target = 18;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start <= end) { // 0 <= 6
            //int mid = (end + start) / 2; -> might cause overflow
            int mid = start + (end - start) / 2;


            if(arr[mid] < target) { // 23 < 18
                start = mid + 1;

            }
            else if(arr[mid] > target) { // 23 > 18
                end = mid - 1;

            }
            else {
                System.out.println("Found");
                index = mid;
                break;
            }
        }

        if(start > end) {
            System.out.println("Not found");
        }
        System.out.println("Index: " + index);
    }
}
