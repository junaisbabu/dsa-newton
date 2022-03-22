package Mock;

import java.util.Scanner;

public class FindPowerOfKthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = 0;
        int count = 1;
        int power = 1;
        if(num % 2 == 0) {

            for(i = 0; power <= num; i++) {

                    count *= 2;

                    if(count > num)
                        break;

                    power *= 2;
            }
        }
        System.out.println("2 Power " + i);
        System.out.println("Answer : " + power);
    }
}
