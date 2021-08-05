package NinjaCode.stack;

import java.util.ArrayList;

public class StackImpl<T> {

    final private int size;

    final private ArrayList<T> array;

    private int top = -1;

    public StackImpl(final int size) {
        this.array = new ArrayList<T>(size);
        this.size = size;
    }

    public void push(final T value) {
        if(top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            if(array.size() > top) array.set(top, value);
            else array.add(value);
        }
    }

    public boolean empty() {
        return top == -1;
    }

    public T peek() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return array.get(top);
        }
    }

    public T pop() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return array.get(top--);
        }
    }

    public int getSize() {
        return size;
    }
}
