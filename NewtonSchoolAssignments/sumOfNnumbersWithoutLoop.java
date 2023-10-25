package NewtonSchoolAssignments;

public class sumOfNnumbersWithoutLoop {


    public  static  int SumOfNumbers(int n){
        int sum = n*(n+1)/2;
         return sum;
    }

    public static void main(String[] args) {

        int result = SumOfNumbers(5);
        System.out.println(result);
    }


}
