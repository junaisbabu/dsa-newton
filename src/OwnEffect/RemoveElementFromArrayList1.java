package OwnEffect;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList1 {
    public static void main(String[] args) {
        List<String> empList = new ArrayList<>();
        empList.add("Junais");
        empList.add("Babu");
        empList.add("Fasil");
        empList.add("Babu");

        System.out.println(empList);

        List<String> newList = new ArrayList<>();

        for(String emp: empList) {
            if(!newList.contains(emp)) {
                newList.add(emp);
            }
        }

        for(String empName: newList) {
            System.out.println(empName);
        }
    }
}
