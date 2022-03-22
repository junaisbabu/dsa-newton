package Oops.AbstractClasses;

// If any class consist of an abstract method then it should be called as a abstract class.
// If it is a abstract class we can not create a object for the abstract class.
// Abstract class may consist of both abstract methods and normal methods ( concrete method ).


abstract class A {

    abstract void show();

    void display() {
        System.out.println("This is concrete method");
    }

}

class B extends A {
    void show() {
        System.out.println("class A");
    }
}


public class AbstractClassExample1 {

    public static void main(String[] args) {
        B b = new B();


        b.show();
        b.display();
    }

}
