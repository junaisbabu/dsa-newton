package Mock;

public class FindIndexOfTheKthElement {
    public static void main(String[] args) {
        int arr[] = {10, 30, 60, 70, 80, 90};

        int k = 80;
        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == k) {
                index = mid;
                break;
            }
            else if(k < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }


        if(index == - 1) {
            System.out.println(index);
        } else {
            System.out.println(index);
        }
    }
}
