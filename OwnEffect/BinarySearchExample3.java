package OwnEffect;

public class BinarySearchExample3 {
    public static void main(String[] args) {
        int arr[] = {88, 2, 33, 20, 10};

        int end = arr.length - 1;

        int index = - 1;

        int start = 0;
        int target = 20;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) {
                start = mid + 1;
            }

            else if(arr[mid] > target) {
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
            System.out.println("Index " + index);

    }
}
