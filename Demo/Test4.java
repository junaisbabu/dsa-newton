package Demo;

public class Test4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int sumArr = 0;
        for(int i : arr) {
            sumArr += i;
        }

        int n = arr.length;

        int sumAll = (n + 1) * (n + 2) / 2;


        System.out.println(sumAll - sumArr);
    }
}
