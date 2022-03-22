package Oops.ClassInitializer;

public class InstanceInitializer {
    int num;


    // Instance Initializer

    {
        num = 222;
        System.out.println("In instance initializer : " + num);
    }


    // Constructor

    InstanceInitializer() {
        num = 111;

        System.out.println("In InstanceInitializer constructor: " + num);
    }

    public static void main(String[] args) {
        System.out.println("In main function");
        InstanceInitializer instanceInitializer = new InstanceInitializer();
    }
}
