package Demo;

public class Test3 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 4, 1, 5, 5};

        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];

        }

        System.out.println(res);
    }
}
