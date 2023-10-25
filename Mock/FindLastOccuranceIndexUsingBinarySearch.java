package Mock;

public class FindLastOccuranceIndexUsingBinarySearch {
// 1, 2, 2, 2,2 ,2 2, ,2 2, 2, 2,2 ,3
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 2, 8, 8, 8};

        int target = 2;
        int start = 0;
        int end = arr.length;
        int index = -1;

        while (start < end) {
            int mid = (start + end) / 2;
            if((mid == end - 1 || arr[mid + 1] > target) && arr[mid] == target) {
                index = mid;
                break;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }


        if(index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println(index);
        }
    }


}
