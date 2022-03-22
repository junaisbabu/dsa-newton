package OwnEffect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList1 {
    public static void main(String[] args) {
        List<String> empList = new ArrayList<>();
        empList.add("Junais");
        empList.add("Babu");
        empList.add("Fasil");
        empList.add("Babu");

        System.out.println("Before " + empList);

        Collections.reverse(empList);

        System.out.println("After " + empList);
    }
}
