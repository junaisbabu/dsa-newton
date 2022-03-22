package Demo.Recursion;

public class RecursionExample1 {
    static void recursionFunc(String str, int i) {
        int length = str.length();


        if(i == length) {
            return;
        }
        String newStr = "";


        newStr += str.charAt(i);

        System.out.print(newStr + " -> ");

        recursionFunc(str, i += 1);
    }

    public static void main(String[] args) {
        String str = "Hello world";
        int i = 0;
        recursionFunc(str, i);
    }
}
