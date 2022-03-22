package OwnEffect;

public class InsertionSortExample2 {
    static  int[] insertionSortFunc(int arr[], int n) {

        for(int i=1; i<n; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {55, 32, 73, 48, 9, 3};
        int n = arr.length;
        int afterSorting[] = insertionSortFunc(arr, n);

        for (int i=0; i<n; i++) {
            System.out.print(afterSorting[i]+"  ");
        }
    }
}
