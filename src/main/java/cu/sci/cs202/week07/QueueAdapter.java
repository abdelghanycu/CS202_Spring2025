package cu.sci.cs202.week07;

import java.util.Deque;
import java.util.ArrayDeque;
//R-6.11
public class QueueAdapter<T> {
    private Deque<T> deque;

    public QueueAdapter() {
        deque = new ArrayDeque<>();
    }

    // Enqueue - addlast
    public void enqueue(T element) {
        deque.addLast(element);
    }

    // Dequeue - remove first element
    public T dequeue() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.removeFirst();
    }

    // Peek - first element
    public T peek() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.peekFirst();
    }

    // check Queue is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // size
    public int size() {
        return deque.size();
    }

    // Print Queue
    @Override
    public String toString() {
        return deque.toString();
    }

    // Test
    public static void main(String[] args) {
        QueueAdapter<Integer> queue = new QueueAdapter<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue: " + queue);          // [10, 20, 30]
        System.out.println("Front: " + queue.peek());   // 10
        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Queue after dequeue: " + queue); // [20, 30]
    }
}





