package stacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue<T> {
    private Queue<T> insertQueue = new LinkedList<>();
    private Queue<T> removeQueue = new LinkedList<>();

    public void push(T element) {
        insertQueue.offer(element);
    }

    public T pop() {
        if(isEmpty()) {
            throw new IllegalStateException("The stack is empty.");
        }

        while(insertQueue.size() > 1) {
            removeQueue.offer(insertQueue.poll());
        }

        T top = insertQueue.poll();

        Queue<T> temp = insertQueue;
        insertQueue = removeQueue;
        removeQueue = temp;

        return top;
    }

    public boolean isEmpty() {
        return insertQueue.isEmpty();
    }
}
