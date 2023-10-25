package Demo.Stack;

import java.util.Stack;

public class StackClassExample1 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int poppedElement;
        int peekedElement;
        int searchElement;

        //pop
        if(integerStack.isEmpty()) {
            System.out.println("Empty stack");
        }
        else {
            poppedElement = integerStack.pop();
            System.out.println("Popped Element: " + poppedElement);
        }

        // push
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);


        // peek
        peekedElement = integerStack.peek();

        // push
        integerStack.push(50);

        // pop
        if(integerStack.isEmpty()) {
            System.out.println("Empty stack");
        }
        else {
            poppedElement = integerStack.pop();
            System.out.println("Popped Element: " + poppedElement);
        }

        integerStack.push(60);

        // peek
        peekedElement = integerStack.peek();
        System.out.println("Peeked Element: " + peekedElement);


        // search
        searchElement = integerStack.search(30);
        System.out.println("Searched Element 30: " + searchElement);

        searchElement = integerStack.search(50);
        System.out.println("Searched Element 50: " + searchElement);

        searchElement = integerStack.search(90);
        System.out.println("Searched Element 90: " + searchElement);

        searchElement = integerStack.search(40);
        System.out.println("Searched Element 40: " + searchElement);


        System.out.println(integerStack);
    }
}
