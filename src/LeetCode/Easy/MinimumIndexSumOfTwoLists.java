/*
package LeetCode.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class MinimumIndexSumOfTwoLists {
    public static void findRestaurant(String[] list1, String[] list2) {

        int j = -1;
        int k = -1;
        HashSet<String> set = new HashSet<>();

        while (j <= list1.length || k < list2.length) {
            if(j <= list1.length) {
                j ++;
                set.add(list1[j]);
                System.out.println(j);
            }
            else {
                k ++;
                System.out.println("k : " + k);
                if(set.contains(list2[k])) {

                    System.out.println(list2[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] s1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] s2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};


        findRestaurant(s1, s2);
    }
}
*/
