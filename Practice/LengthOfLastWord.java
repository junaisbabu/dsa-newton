package Practice;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        String[] arr = str.split(" ");

        String lastWord = arr[arr.length - 1];

        int length = lastWord.length();

        System.out.println("Last word " + lastWord + " length : " + length);
    }
}
