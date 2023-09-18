package stacksAndQueues;

import java.util.Stack;

public class QueueWithStack<T> {
    private Stack<T> insertStack = new Stack<>();
    private Stack<T> removeStack = new Stack<>();

    public void enqueue(T element) {
        insertStack.push(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException(("The queue is empty."));
        }

        insertStackToRemoveStack();
        return removeStack.pop();
    }

    public boolean isEmpty() {
        return insertStack.isEmpty() && removeStack.isEmpty();
    }

    private void insertStackToRemoveStack() {
        if (removeStack.isEmpty()) {
            while (!insertStack.isEmpty()) {
                removeStack.push(insertStack.pop());
            }
        }
    }
}
