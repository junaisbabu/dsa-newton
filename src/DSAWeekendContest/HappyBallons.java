package DSAWeekendContest;

import java.util.Scanner;

public class HappyBallons {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] Arr = new int[N];
        int i, count = 0;

        for(i=0; i<N; i++) {
            Arr[i] = input.nextInt();
        }

        for(i=0; i<N; i++) {
            if((i+1)%2==0 && Arr[i]%2==0) {
                count ++;
            } else if(Arr[i]%2!=0 && (i+1)%2!=0) {
                count ++;
            }
        }

        System.out.print(count);
    }
}
