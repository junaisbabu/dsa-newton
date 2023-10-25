package OwnEffect;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList2 {

    static ArrayList<String> reverse(ArrayList<String> names) {
        ArrayList<String> result = new ArrayList<>();

        for(int i = names.size() - 1; i >= 0; i--) {
            result.add(names.get(i));
        }

        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> empList = new ArrayList<>();
        empList.add("Junais");
        empList.add("Babu");
        empList.add("Fasil");
        empList.add("Babu");

        System.out.println("Before " + empList);


        ArrayList<String> newNames = reverse(empList);

        System.out.println(newNames);
    }
}
