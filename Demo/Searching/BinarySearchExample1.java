package Demo.Searching;

public class BinarySearchExample1 {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};

        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
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
            System.out.println(index);
        }
        else {
            System.out.println(index);
        }

    }
}
