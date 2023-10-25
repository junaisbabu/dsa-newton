//package OwnEffect;
//
//import java.util.Arrays;
//
//public class CheckArray {
////    public static void main(String[] args) {
////
////
////
////        int arr[][][] = {{{1, 2, 3}}, {{4, 5, 6,}}, {{7, 8, 9}}};
////
////        int[][][] print = checkArray(arr);
////
////        for(int i = 0; i < arr.length; i++) {
////            System.out.println(print[i]);
////        }
////    }
////
////    static int[][][] checkArray(int[][][] arr) {
////
////        if(arr.getClass().isArray()) {
////            checkArray(arr);
////        }
////
////            return arr;
////
////
////    }
//
//
//    public static void main(String[] args) {
//        int arr[] = {1, 1, 1, 2, 3, 4, 4};
//        int newarr[] = new int[]
//
//       Arrays.sort(arr);
//
//       int i;
//
//        for (i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int seq = 0;
//        int count = 1;
//        for(i=1; i < arr.length; i++) {
//            if(arr[seq] == arr[i]) { // 1 1 // 1 1 // 2 1
//                count = count + 1;
//
//            }
//
//            else if(arr[seq] != arr[i]) {
//                int[i] newArr = arr[i];
//            }
//            seq = i;
//            System.out.println(i);
//
//        }
//
//        System.out.println(" Count: " + count);
//
//
//    }
//
//}
