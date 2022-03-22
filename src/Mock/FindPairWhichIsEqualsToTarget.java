package Mock;

public class FindPairWhichIsEqualsToTarget {

    //    [1,3,5,6,10]  k=7 o/p:[1,6]

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 10, 2, 4, 8};
        int target = 8;
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if(j < arr.length) {
                if (arr[i] + arr[j] == target) {
//                    if(i < j)
                    System.out.println(arr[i] + " " + arr[j]);
                }

                j ++;
                i --;
            }
            else {

                j = i + 2;

            }


        }
    }

}
