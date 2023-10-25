//package LeetCode.Easy;
//
//public class ReverseString2 {
//    public static String reverseStr(String s, int k) {
//
//        char charArr[] = s.toCharArray();
//
//        for(int i = 0; i < k / 2; i++) {
//            char temp = charArr[i];
//            charArr[i] = charArr[k - i - 1];
//            charArr[k - i - 1] = temp;
//        }
//
//        return new String(charArr);
//    }
//
//    public static void main(String[] args) {
//        String str = "abcdefg";
//        int k = 2;
//
//        System.out.println(reverseStr(str, k));
//    }
//}
