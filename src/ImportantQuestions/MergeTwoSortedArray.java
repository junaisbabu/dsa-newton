package ImportantQuestions;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] lArr = {1, 4, 6, 7, 9, 11};
        int[] rArr = {3, 5, 8};

        int n1 = lArr.length;
        int n2 = rArr.length;

        int[] arr = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if(lArr[i] < rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = lArr[i];
            i ++;
            k ++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j ++;
            k ++;
        }

        for(int a = 0; a < n1 + n2; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
