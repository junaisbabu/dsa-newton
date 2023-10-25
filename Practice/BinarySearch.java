package Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int start = 0;
        int end = arr.length;
        int search = 8;
        boolean flag = false;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == search) {
                System.out.println("No of index is : " + (mid+1));
                flag = true;
                break;
            }
            else if(search < arr[mid]) {
                end = mid - 1;
            }
            else if(search > arr[mid]) {
                start = mid + 1;
            }
        }

        if(flag == false)
            System.out.println("Invalid number");
    }
}
