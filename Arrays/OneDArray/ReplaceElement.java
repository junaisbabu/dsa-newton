package Arrays.OneDArray;

import java.util.Scanner;

public class ReplaceElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] arr = new int[n];
//        int i;
//
//        for(i=0; i<n; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int sf = arr[0], sl = arr[n-1];
//
//        int[] replace = new int[n];
//
//        for(i=0; i<n; i++) {
//            if(sf == arr[i] || sl == arr[n-1]) {
//                replace[i] = arr[i] * arr[i+1];
//            }
//
//            if(sf != arr[i] || sl != arr[n-1]) {
//                replace[i] = arr[i] * arr[i+2];
//            }
//        }
//
//        for(i=0; i<n; i++) {
//            System.out.print(replace[i]+" ");
//        }


        int N = input.nextInt();
        int[] arr = new int[N];
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }

        for(int i=0; i<N; i++){
            if(i == 0){
                A[i] = arr[0]*arr[1];
                System.out.println("if  "+A[i]);
            }else if(i==N-1){
                A[i] = arr[i-1]*arr[i];
                System.out.println("else if  "+A[i]);
            }else{
                A[i]=arr[i-1]*arr[i+1];
                System.out.println("else  "+A[i]);
            }
        }

        for(int i=0;i<N; i++){
            System.out.print(A[i]+" ");
        }

    }

}
