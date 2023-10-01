package org.example;

import java.util.*;

public class Problem1 {
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

        Stack<Integer> newStack = filter(stack1, stack2);

        // Print the new Stack
        newStack.printStack();
        sc.close();
    }

    public static Stack<Integer> filter(Stack<Integer> stack1, Stack<Integer> stack2) {
        HashSet<Integer> stacks = new HashSet<>();

        for (int i = 0; i < stack1.top + 1; i++)
            stacks.add(stack1.getValue(i));

        for (int i = 0; i < stack2.top + 1; i++)
            stacks.add(stack2.getValue(i));

        Stack<Integer> newStack = new Stack<>(stacks.size());

        for (Integer stack : stacks)
            newStack.push(stack);

        return newStack;
    }
}