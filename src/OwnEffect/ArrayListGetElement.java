package OwnEffect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetElement {
    public static void main(String[] args) {

        List <Integer> numberList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int numbers = (int) (Math.random() * 100);
            numberList.add(numbers);
        }

        for (int i = 0; i < 5; i++) {
            int number = numberList.get(i);

            System.out.println("Number: " + number);
        }
        System.out.println();
    }
}
