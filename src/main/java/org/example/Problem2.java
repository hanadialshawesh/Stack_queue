package org.example;// Find the common in two stacks
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<>(5);
        Stack<Integer> stack2 = new Stack<>(5);

        // Input for Stack1
        System.out.print("Enter 5 values for Stack 1: ");
        for (int i = 0; i < 5; i++)
            stack1.push(sc.nextInt());

        // Input for Stack2
        System.out.print("Enter 5 values for Stack 2: ");
        for (int i = 0; i < 5; i++)
            stack2.push(sc.nextInt());

        // Find the common between two stacks and store in a new stack
        Stack<Integer> commons = new Stack<>(5);

        for (int i = 0; i < stack1.top + 1; i++)
            for (int j = 0; j < stack2.top + 1; j++) {
                if (stack1.getValue(i) == stack2.getValue(j))
                    commons.push(stack1.getValue(j));
            }

        // Print the common values
        commons.printStack();
        sc.close();
    }
}