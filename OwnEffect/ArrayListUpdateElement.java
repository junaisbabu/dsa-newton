package OwnEffect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdateElement {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int num = (i + 1) * 100;
            numberList.add(num);
        }

        numberList.set(3, 123);

        System.out.println(numberList);

        for(int i = 0; i < numberList.size(); i++) {
            int output = numberList.get(i);
            System.out.println("Output : " + output);
        }
    }
}
