package OwnEffect;

public class InsertionSortExample1 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 4, 2};
        int n = arr.length;
        for(int i=1; i<n; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                System.out.println(arr[j+1]+" a[j+1] = arr[j] "+arr[j]);
                j--;
                System.out.println(j+" j--;");
            }
            arr[j+1] = key;
            System.out.println(arr[j+1]+"arr[j+1] = key "+ key);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
