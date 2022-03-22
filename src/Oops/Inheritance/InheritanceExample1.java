package Oops.Inheritance;

class A {
    int n1, n2;

    void showN1N2() {
        System.out.println("n1 : " + n1 + "  n2 : " + n2);
    }
}

class B extends A{
    int n3;

    void showN3() {
        System.out.println("n3 : " + n3);
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        A a = new A();
        a.n1 = 100;
        a.n2 = 200;
        a.showN1N2();

        B b = new B();
        b.n1 = 111;
        b.n2 = 222;
        b.n3 = 333;
        b.showN1N2();
        b.showN3();
    }

}
