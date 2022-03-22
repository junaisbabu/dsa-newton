package OwnEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> brands = new ArrayList<>();

        brands.add("Nokia");
        brands.add("Samsung");
        brands.add("Apple");
        brands.add("Vivo");
        brands.add("Oppo");

        System.out.println(brands);

        System.out.println(brands.get(3));

        System.out.println("Size: " + brands.size());

        brands.add(3, "Redmi");

        System.out.println(brands);

        System.out.println("Size: " + brands.size());

        String sample = input.next();
        brands.add(sample);

        System.out.println(brands);
    }

}
