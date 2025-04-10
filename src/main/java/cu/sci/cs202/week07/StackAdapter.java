package cu.sci.cs202.week07;

import java.util.Deque;
import java.util.ArrayDeque;
//R-6.10
public class StackAdapter<T> {
    private Deque<T> deque;

    public StackAdapter() {
        deque = new ArrayDeque<>();
    }

    // Push element onto the stack
    public void push(T element) {
        deque.addFirst(element);
    }

    // Pop element from the stack
    public T pop() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.removeFirst();
    }

    // Peek at the top element
    public T peek() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.peekFirst();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Optional: size
    public int size() {
        return deque.size();
    }

    // Optional: print stack (from top to bottom)
    @Override
    public String toString() {
        return deque.toString();
    }

    // Test
    public static void main(String[] args) {
        StackAdapter<Integer> stack = new StackAdapter<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // Stack:[30, 20, 10]
        System.out.println("Top element: " + stack.peek()); // Top element: 30
        System.out.println("Pop: " + stack.pop()); // Pop: 30
        System.out.println("Stack after pop: " + stack); // Stack after pop: [20, 10]
    }
}
