package OwnEffect;

public class StringReverseExample2 {
    public static void main(String[] args) {
        String str = "java";

        char arr[] = str.toCharArray();
        int length = arr.length;

        for(int i = 0; i < length / 2; i++) {


            char temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;

        }

        String reverseString = new String(arr);

        System.out.println(reverseString);

    }
}
