package OwnEffect;

public class MultiDiemensioalArray {
    public static void main(String[] args) {
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        int[][][] result = checkArray(arr);
    }

    static int[][][] checkArray(int[][][] arr) {
        if(arr.getClass().isArray()) {
            checkArray(arr);
        } else {
            return arr;
        }

            return arr;
    }
}
