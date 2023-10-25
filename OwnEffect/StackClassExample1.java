package OwnEffect;

import java.util.Stack;

public class StackClassExample1 {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        int popedElement;
        int peekedElement;
        int searchResult;

        // pop
        if(integerStack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            popedElement = integerStack.pop();
            System.out.println("Poped element : " + popedElement);

        }

        // push

        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(80);

        System.out.println("Current Stack : " + integerStack);

        // peek
        peekedElement = integerStack.peek();
        System.out.println("Peeked element : " + peekedElement);

        System.out.println("Current Stack : " + integerStack);

        integerStack.push(200);
        integerStack.push(700);

        System.out.println("Current Stack : " + integerStack);

        // pop
        popedElement = integerStack.pop();
        System.out.println("Poped element : " + popedElement);

        System.out.println("Current Stack : " + integerStack);

        // peek
        peekedElement = integerStack.peek();
        System.out.println("Peeked element : " + peekedElement);

        System.out.println("Current Stack : " + integerStack);

        // search

        searchResult = integerStack.search(10);
        System.out.println("Search Result : " + searchResult);

        searchResult = integerStack.search(700);
        System.out.println("Search Result : " + searchResult);

        searchResult = integerStack.search(200);
        System.out.println("Search Result : " + searchResult);

        searchResult = integerStack.search(80);
        System.out.println("Search Result : " + searchResult);
    }
}
