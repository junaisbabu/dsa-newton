package Oops.Inheritance;


    class G {
        int i = 555;

        void displayG() {
            System.out.println("In class G");

            System.out.println("i : " + i);
            System.out.println("__________");
        }
    }

    class H extends G {
        int i;

        void displayH() {
            System.out.println("In class H");
            System.out.println("super i : " + super.i);
            System.out.println("i : " + i);

            System.out.println("___________");
        }

        H(int a, int b) {
            System.out.println("In H constructor");
            super.i = a;
            i = b;
        }
    }
public class SuperKeywordExample2 {
    public static void main(String[] args) {
        G g = new G();
        g.displayG();


        H h = new H(1, 2);
        h.displayH();
    }
}
