package NewtonSchoolAssignments;

public class PalindromeUsingRecursion {
    static boolean check_Palindrome(String str,int s, int e) {

        boolean boolValue = true;

        if(s == e)
            return boolValue;

        if(str.charAt(s) != str.charAt(e)) {

            boolValue = false;

            return boolValue;
        }


        if(s < e + 1)
            return check_Palindrome(str, s + 1, e - 1);


        return boolValue;
    }

    public static void main(String[] args) {
        String str = "malayalam";

        int s = 0;
        int e = str.length() - 1;

        boolean isPalindrome = check_Palindrome(str, s, e);

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
