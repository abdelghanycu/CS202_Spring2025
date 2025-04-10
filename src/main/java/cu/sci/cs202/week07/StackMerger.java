package cu.sci.cs202.week07;

import java.util.*;
//C-6.32
public class StackMerger {

    public static <E> void mergeStacks(Stack<E> S, Stack<E> T, Deque<E> D) {
        // Step 1: Move elements from S to D (reversing S's order)
        while (!S.isEmpty()) {
            D.addFirst(S.pop());  // front of deque gets S's bottom
        }

        // Step 2: Move elements from T to D (reversing T's order)
        while (!T.isEmpty()) {
            D.addFirst(T.pop());  //  front of deque gets T's bottom
        }

        // Step 3: Move elements from D to S
        while (!D.isEmpty()) {
            S.push(D.removeFirst());  // now S gets T's original order below its own
        }

    }

    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();
        Deque<Integer> D = new ArrayDeque<>();

        // Add elements to S
        S.push(3);
        S.push(2);
        S.push(1);  // Top of S is 1

        // Add elements to T
        T.push(6);
        T.push(5);
        T.push(4);  // Top of T is 4

        mergeStacks(S, T, D);

        // Print result: Should be [1, 2, 3, 4, 5, 6] from top to bottom
        System.out.println("Final Stack S (top to bottom):");
        while (!S.isEmpty()) {
            System.out.println(S.pop());
        }
    }
}

