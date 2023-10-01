package org.example;

interface IStack<E> {
    int size();
    boolean isEmpty();
    boolean isFull();
    void push(E e);
    E peek();
    E pop();
    void printStack();
    E getValue(int index);

}

class Stack<E> implements IStack<E> {
    public E[] array;
    public int capacity;
    public int top = -1;

    public Stack(int size) {
        this.capacity = size;
        this.array = (E[]) new Object[size];
    }

    @Override
    public int size() {

        return this.top + 1;
    }

    @Override
    public boolean isEmpty() {

        return this.top == -1;
    }

    @Override
    public boolean isFull() {

        return this.size() == this.capacity;
    }

    @Override
    public void push(E e) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }

        this.array[++this.top] = e;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        E removedItem = this.array[this.top];
        this.array[this.top--] = null;

        return removedItem;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return this.array[this.top];
    }

    public E getValue(int index) {

        return this.array[index];
    }

    @Override
    public void printStack() {
        for (int i = 0; i < this.top + 1; i++)
            System.out.print(this.array[i] + " ");
        System.out.print("\n");
    }
}