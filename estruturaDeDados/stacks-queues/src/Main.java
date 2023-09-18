import stacksAndQueues.QueueWithStack;
import stacksAndQueues.StackWithQueue;

public class Main {
    public static void main(String[] args) {
        QueueWithStack<Integer> queue = new QueueWithStack<>();
        StackWithQueue<Integer> stack = new StackWithQueue<>();

        System.out.println("---- Queue Operations ----");

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 3

        System.out.println("---- Stack Operations ----");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
    }
}
