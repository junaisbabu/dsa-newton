package Mock;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterInAString {
    public static void main(String[] args) {
        String str = "aaabbbb";

        char[] ch = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for(char s : ch) {
            set.add(s);

        }

        System.out.println(set);
    }
}
