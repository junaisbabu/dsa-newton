package OwnEffect;

public class BinarySearchExample2 {
    public static void main(String[] args) {
      int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int lenght = arr.length - 1;

        int start = 0;
        int end = lenght;

        int findNum = 70;

        int index = 0;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(findNum < arr[mid]) {
                start = mid + 1;
            }
        }
    }
}
