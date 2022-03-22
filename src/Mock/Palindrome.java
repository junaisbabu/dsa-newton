package Mock;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ann";
        boolean boolValue = true;
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                boolValue = false;
            }
        }

        if(boolValue)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

    }
}
