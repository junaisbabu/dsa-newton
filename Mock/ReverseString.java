package Mock;

public class ReverseString {
    static String reverseString(String str) {
        int n = str.length();
        int halfOfLength = n / 2;
        char[] ch = str.toCharArray();

        for(int i = 0; i < halfOfLength; i++) {
            // swap to the same array
            char temp = ch[i];
            ch[i] = ch[n - i - 1];
            ch[n - i - 1] = temp;
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "junais";

        String str = reverseString(s);

        System.out.println(str);
    }
}
