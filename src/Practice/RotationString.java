package Practice;

public class RotationString {

    static boolean rotationString(String s1, String s2) {

        if(s1 == null || s2 == null) {
            return false;
        }
        else if(s1.length() != s2.length()) {
            return false;
        }
        else {
            String concatenated = s1 + s1; // ABCDABCD
            return concatenated.contains(s2);
        }

    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        boolean bool = rotationString(s1, s2);

        if(bool)
            System.out.println("Rotation");
        else
            System.out.println("Not a Rotation");
    }
}
