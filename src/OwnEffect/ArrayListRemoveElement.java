package OwnEffect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveElement {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int num = (i + 1) * 100;
            numberList.add(num);
        }

        System.out.println(numberList);

        int index = 3;
        numberList.remove(index);

        System.out.println(numberList);

        Integer a = 500;
        numberList.remove(a);

        System.out.println(numberList);

    }
}
