package OwnEffect;

public class StringReverseExample3 {
    public static void main(String[] args) {

        String orginalString = "junais";
        StringBuilder stringBuilder = new StringBuilder(orginalString);

                stringBuilder.reverse();

                String reverseString = stringBuilder.toString();

        if(orginalString.equals(reverseString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }



        System.out.println(stringBuilder);
    }
}
