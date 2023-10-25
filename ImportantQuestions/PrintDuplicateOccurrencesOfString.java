package ImportantQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class PrintDuplicateOccurrencesOfString {

    static void findDuplicateWord(String str) {
        HashMap<String, Integer> hm = new HashMap<>();

        String[] s = str.split(" ");

        for(String tempString: s) {
            if(hm.get(tempString) != null) {
                System.out.println(hm.get(tempString));
                hm.put(tempString, hm.get(tempString) + 1);
            }
            else {
                hm.put(tempString, 1);
            }
        }

        Iterator<String> tempString = hm.keySet().iterator();

        while (tempString.hasNext()) {
            String temp = tempString.next();

            if(hm.get(temp) > 1) {
                System.out.println("The word " + temp + " appeard " + hm.get(temp) + " no of times");
            }
        }
    }

    public static void main(String[] args) {
        findDuplicateWord("I I am am am learning java java java java java");
    }
}
