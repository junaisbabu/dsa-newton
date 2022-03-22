package DSAWeekendContest;

import java.util.Scanner;

public class MovingRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0,v=0;
        int n = input.nextInt();
        int array[] = new int[n];
        for(int k = 1; k < n; k++) {
            array[k] = input.nextInt();
        }
        for (int k = 1; k < array.length; k++){  // 5 4 1 2 1
            if(array[k-1] < array[k]){
                v=0;
                System.out.println(v);
            }
            else {
                v++;
            }
            count=Math.max(count,v);
            System.out.println(count);
        }
        System.out.println(count);
    }
}
