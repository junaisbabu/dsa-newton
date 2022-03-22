package Arrays.OneDArray;

import java.util.Scanner;

public class AlternateSumProduct {


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        int sum = 0;
//        int prod = 1;
//        int count =0;
//        for(int i=0; i<N; i++){
//            arr[i] = sc.nextInt(); // { 1, 2, 3, 4, 5 }
//        }
//
//        for(int i=0; i<N; i++){
//            if(i%2 == 0){ // 0, 1, 0, 1, 0, 1
//                prod=prod*arr[i]; // 1 = 1*1, 3 = 1*3, 15 = 3*5
//                System.out.println(prod);
//            }else{
//                count++;
//                sum=sum+arr[i];
//            }
//        }
//
//        System.out.print(sum+" ");
//        if(count == 0){
//            prod =0;
//        }else{
//            System.out.print(prod);
//        }

                    int sum =0;
                    int product =1;
                    Scanner scan = new Scanner(System.in);
                    int N = scan.nextInt();
                    int[] Arr = new int[N];
                    for(int i=0; i<N; i++){
                        Arr[i] = scan.nextInt();
                    }
                    for(int i=0; i<N; i++){
                        if((i+1) % 2 == 0){
                            sum += Arr[i];
                        }else{
                            product *= Arr[i];
                        }
                    }
                    System.out.println(sum+" "+product);

    }

}
