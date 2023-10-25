package OwnEffect;

public class RecursionExample2 {

    static void test(int count) {
        if(count < 5) {
            System.out.println("count is: " + count);
//            count ++;
            test(count+1);
        }
    }

    public static void main(String[] args) {
        test(0);
    }
}
