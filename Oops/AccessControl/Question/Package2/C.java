package Oops.AccessControl.Question.Package2;

import Oops.AccessControl.Question.Package1.Example;

public class C extends Example {
    void show() {
        System.out.println(publicB);
        System.out.println(protectedC);

        /*
        System.out.println(defaultA);
        System.out.println(privateD);
         */
    }
}
