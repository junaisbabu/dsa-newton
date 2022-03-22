package Mock;

public class PowerSet {

    static void powerSet(String str, int index, String curr) {
        int length = str.length();
        if(index == length)
            return;

        System.out.println(curr);

        for(int i = index + 1; i < length; i++) {
            curr += str.charAt(i);
            powerSet(str, i, curr);
            curr = curr.substring(0, curr.length() - 1);
            System.out.println("current : " + curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        int index = -1;

        String curr = "";

        powerSet(str, index, curr);
    }
}


/*
    
 */
