package org.example;

    public class Queue<T> {
        private T[] array;
        private int size;
        private int front;
        private int rear;

        public Queue(int capacity) {
            this.array = (T[]) new Object[capacity];
            size = 0;
            front = 0;
            rear = -1;
        }

        public void enqueue(T item) {
            if (size == this.array.length) {
                resizeArray();
            }
            rear = (rear + 1) % this.array.length;
            this.array[rear] = item;
            size++;
        }

        public T dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("org.example.Main.Queue is empty");
            }
            T item = this.array[front];
            this.array[front] = null;
            front = (front + 1) % this.array.length;
            size--;
            return item;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        // resizeArray to extend array capacity
        private void resizeArray() {
            int newCapacity = this.array.length * 2;
            T[] newArray = (T[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = this.array[(front + i) % this.array.length];
            }
            this.array = newArray;
            front = 0;
            rear = size - 1;
        }

        // BeforeRare to return the element before the rear element
        public T BeforeRear() {
            if (isEmpty())
                return null;
                              //  -1 +1 % 1 = 0 "null'
            int index = (rear - 1 + array.length) % array.length;
            return array[index];
        }

        public void printQueue() {
            for (int i = 0; i < size; i++)
                System.out.print(array[i] + " ");

            System.out.print("\n");
        }
}
