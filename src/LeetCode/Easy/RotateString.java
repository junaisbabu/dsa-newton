package LeetCode.Easy;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String st3 = s + s;
        if (st3.contains(goal))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abced";

        System.out.println(rotateString(s1, s2));
    }
}
