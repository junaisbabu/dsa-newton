package Mock;

public class IsArraySquareExample1 {

    // Time complexity -> O( n2 )

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 9, 1};

        int count = 0;

        for(int i = 0; i < arr1.length; i++) {
            int temp = arr1[i] * arr1[i];
            for(int j = 0; j < arr1.length; j++) {
                if(arr2[j] == temp) {
                    count ++;
                }

            }
        }


        if(count == arr1.length)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
