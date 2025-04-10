package cu.sci.cs202.week07;

import java.util.Stack;
import java.util.NoSuchElementException;
//C-6.31
public class DequeUsingStacks<E> {
    private Stack<E> frontStack;
    private Stack<E> backStack;

    public DequeUsingStacks() {
        frontStack = new Stack<>();
        backStack = new Stack<>();
    }

    // Add to front
    public void addFirst(E element) {
        frontStack.push(element);
    }

    // Add to back
    public void addLast(E element) {
        backStack.push(element);
    }

    // Remove from front
    public E deleteFirst() {
        if (frontStack.isEmpty()) {
            transfer(backStack, frontStack);
        }
        if (frontStack.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return frontStack.pop();
    }

    // Remove from back
    public E deleteLast() {
        if (backStack.isEmpty()) {
            transfer(frontStack, backStack);
        }
        if (backStack.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return backStack.pop();
    }

    // Peek at front
    public E first() {
        if (frontStack.isEmpty()) {
            transfer(backStack, frontStack);
        }
        if (frontStack.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return frontStack.peek();
    }

    // Peek at back
    public E last() {
        if (backStack.isEmpty()) {
            transfer(frontStack, backStack);
        }
        if (backStack.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return backStack.peek();
    }

    // Utility method to transfer elements from one stack to another
    private void transfer(Stack<E> source, Stack<E> destination) {
        while (!source.isEmpty()) {
            destination.push(source.pop());
        }
    }

    // Check if deque is empty
    public boolean isEmpty() {
        return frontStack.isEmpty() && backStack.isEmpty();
    }

    // Return total size
    public int size() {
        return frontStack.size() + backStack.size();
    }

    public static void main(String[] args) {
        DequeUsingStacks<Integer> deque = new DequeUsingStacks<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);

        System.out.println("First: " + deque.first());  // 5
        System.out.println("Last: " + deque.last());    // 20

        System.out.println("Deleted First: " + deque.deleteFirst()); // 5
        System.out.println("Deleted Last: " + deque.deleteLast());   // 20

        System.out.println("Size: " + deque.size());    // 1
    }
}




