package OwnEffect;

public class RecursionExapmle1 {

    static int count = 0;

    static  void test() {

        count ++;

        if(count < 5) {
            System.out.println("count is: " + count);

            test();

        }
    }
    public static void main(String[] args) {
        test();
    }
}
