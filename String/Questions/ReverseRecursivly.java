package String.Questions;

public class ReverseRecursivly {
//        static String  reverse(String str) {
//            System.out.println(str);
//            if(str == null || str.length() <= 1) {  // 6 <= 1
//                return str;
//            }
//
//            return reverse(str.substring(1)) + str.charAt(0); // unais + j
//        }



        static String reverse(String str) {

            char arr[] = str.toCharArray();


            int start = 0;
            int end = arr.length - 1;

            if(start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start ++;
                end --;
            }

            return new String(arr);
        }

    public static void main(String[] args) {
        String str = "Junais";

        System.out.println(reverse(str));

        char test[] = {'j', 'u', 'n', 'a', 'i', 's'};

        String s = new String(test);
        System.out.println(s);

    }
}
