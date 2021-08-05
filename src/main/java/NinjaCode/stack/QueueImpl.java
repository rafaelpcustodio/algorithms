package NinjaCode.stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class QueueImpl<T> {

    final private ArrayList<T> array;

    final private int size;

    private int index = -1;

    public QueueImpl(final int size) {
        this.array = new ArrayList<T>(size);
        this.size = size;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean add(T t) {
        int nextIndex = index + 1;
        if(t == null) {
            throw new NullPointerException();
        }
        if(nextIndex > size) {
            throw new IllegalStateException();
        }
        array.add(index++, t);
        return true;
    }

    public T element() {
        if(index > 0) {
            return array.get(index);
        }
        throw new NoSuchElementException();
    }

    public boolean offer(T t) {
        int nextIndex = index + 1;
        if(nextIndex > size) {
            System.out.println("Overflow");
            return false;
        }
        array.add(index++, t);
        return true;
    }

    public T peek() {
        if(index > 0) {
            return array.get(index);
        }
        return null;
    }

    public T poll() {
        if(index == -1) {
            return null;
        }
        T curr = array.get(index);
        array.add(index, null);
        return curr;
    }

    public T remove() {
        if(index == -1) {
            throw new NoSuchElementException();
        }
        T curr = array.get(index);
        array.add(index, null);
        return curr;
    }
}
