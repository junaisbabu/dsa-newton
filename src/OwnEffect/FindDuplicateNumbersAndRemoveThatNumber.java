package OwnEffect;

public class FindDuplicateNumbersAndRemoveThatNumber {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 8, 3, 9, 2};
        int length = arr.length;
        int count = 0;
        int test = 0;

        for(int i = 0; i < length-1; i++) {
            for(int j = 1; j < length; j++) {
                if(arr[i] == arr[j]) {

                    count ++;

                }
            }
        }
        System.out.println(count);

        
    }
}
