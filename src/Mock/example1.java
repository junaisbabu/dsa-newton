package Mock;

public class example1 {
    public static void main(String[] args) {
        int arr[] = {-2, -1, 1, 2};
        int j = 1;
        for(int i = 0; i < arr.length - 1; i++) {

                if(arr[i] + arr[j] == 0) {
                    System.out.println(arr[i] + "  " + arr[j]);
                }

                if(j < arr.length - 1) {
                    j++;
                    i--;
                }
                else {
                    j = i + 2;
                }

        }

    }
}
