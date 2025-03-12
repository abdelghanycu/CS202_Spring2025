package cu.sci.cs202.week05_2;

public class Node {

  int value;
  Node next;
  Node prev;

  Node(int value, Node next, Node prev) {
    this.value = value;
    this.next = next;
    this.prev = prev;
  }
}
