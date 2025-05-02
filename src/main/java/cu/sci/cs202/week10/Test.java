package cu.sci.cs202.week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Test {

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(5);
    q.add(15);
    q.add(99);
    q.add(63);

    System.out.println("Queue");
    while (!q.isEmpty()) {
      System.out.println(q.poll());
    }

    Stack<Integer> st = new Stack<>();

    st.push(5);
    st.push(14);
    st.push(85);
    st.push(23);

    System.out.println("Stack");
    while (!st.isEmpty()) {
      System.out.println(st.pop());
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(14);
    pq.add(99);
    pq.add(5);
    pq.add(45);

    System.out.println("PriorityQueue");
    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }

    System.out.println("***********************");

    List<Integer> l = new ArrayList<>();

    l.add(5);
    l.add(42);
    l.add(15);
    l.add(8);

    System.out.println(l);
    Collections.sort(l);
    System.out.println(l);

    List<Student> stList = new ArrayList<>();

    stList.add(new Student("mona", 14));
    stList.add(new Student("mohamed", 412));
    stList.add(new Student("Ali", 17));
    stList.add(new Student("ahmed", 35));

    System.out.println(stList);
    Collections.sort(stList);
    System.out.println(stList);

  }
}
