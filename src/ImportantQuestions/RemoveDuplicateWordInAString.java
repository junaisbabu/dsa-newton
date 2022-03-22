package ImportantQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordInAString {
    public static void main(String[] args) {

        String str = "I am am Junais Babu Babu";

        String[] stringArr = str.split(" ");

        Set<String> Myset = new LinkedHashSet<>();

        for(String x: stringArr) {
            Myset.add(x);
        }

        Iterator itr = Myset.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }


    }
}
