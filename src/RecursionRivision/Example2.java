package RecursionRivision;


// We need to write a java program which can find the sum of first n natural numbers.
// Example: I/P: n = 5
// O/P: O/P: sum = 15 (1+2+3+4+5)


public class Example2 {


    public static int add(int n){
        if(n == 1)
            return 1;
        return add(n-1) + n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(add(n));
//        int sum = 0;
//
//        for(int i = 1; i<= n; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
    }
}

// add(3) = 3 + 3 = 6;
// add(2) = 1 + 2 = 3;
// add(1) = 1;



// 1) Iterative way
// 2) Recursive way

// Two steps of recursion:
// 1) Base Condition
// 2) Recursive Equation

// if recursion is never ending : stackoverflow error

// add(4) = add(3)+4


