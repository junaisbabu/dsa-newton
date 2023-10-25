package Mock;

public class IsArraySquareExample2 {

//    Time complexity -> O( n )

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 9, 1};

        int count = 0;

        int j = 0;

        for(int i = 0; i < arr1.length; i++) {

            int temp = arr1[i] * arr1[i];

            if(j < 3) {

                if (arr2[j] == temp) {
                    count++;
                    i++;
                    j = -1;
                }

                i--;
                j++;
            }

        }

        if(count == arr1.length)
            System.out.println("Yes");
        else
            System.out.println("No");

    }




}
