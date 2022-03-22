package NewtonSchoolAssignments;

import java.util.Scanner;

public class NewtonTask {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        int arr[]={1,1,1,1,1,1};
        long min=1;

        int z=0;
        while(min<n){  // 4 > 3
            min=(min/(arr[z]))*(arr[z]+1);  // 2 / (1) * (1) + 1   -- > 2  --> 4
            System.out.println("min : " + min);
            arr[z]+=1;  // 2  2
            z++; // 1  2
            System.out.println("z: " + z);
            if(z==6){
                z=0;
            }


        }

        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println(arr[i]);
        }

        System.out.print(sum);
    }
}
