package NewtonArena;

public class CompressString {

    public static void main(String[] args) {
        String str = "AAABBCD";

        StringBuffer stringBuffer = new StringBuffer("");
        char currentCharacter = str.charAt(0);

        int count = 1;

        char ch;

        for(int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);

            if(ch == currentCharacter)
                count ++;

            else {
                stringBuffer.append(currentCharacter);
                stringBuffer.append(count);

                currentCharacter = ch;
                count = 1;
            }
        }

        stringBuffer.append(currentCharacter);
        stringBuffer.append(count);

        String newStr = stringBuffer.toString();
        System.out.println(newStr);
    }
}
