package OwnEffect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddElementOfAnyType {
    public static void main(String[] args) {
        List <Object> list = new ArrayList<>();

        list.add("Junais Babu");
        list.add(100);
        list.add(18.3f);

        System.out.println(list);

        for(int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.println("Values : " + value);
        }
        System.out.println();

    }
}
