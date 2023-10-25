package Demo.Strings;

public class ValidParantheses {
    static boolean validParantheses(String s) {
        for(int i = 0; i < s.length(); i += 2) {

            if(s.charAt(i) == '(') {
                if(s.charAt(i + 1) != ')') {
                    return false;
                }
            }
            else if(s.charAt(i) == '{') {
                if(s.charAt(i + 1) != '}') {
                    return false;
                }
            }
            else {
                if(s.charAt(i + 1) != ']') {
                    return false;
                }
            }
        }


        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {

        String s = "(){}[]";

        boolean boolValue = validParantheses(s);

        if(boolValue)
            System.out.println("It's valid");
        else
            System.out.println("It's not valid");

    }
}
