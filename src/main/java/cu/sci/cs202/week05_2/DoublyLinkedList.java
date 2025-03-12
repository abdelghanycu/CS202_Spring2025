package cu.sci.cs202.week05_2;

public class DoublyLinkedList {

  Node header;
  Node trailer;
  int size;

  DoublyLinkedList() {
    header = new Node(0, null, null);
    trailer = new Node(0, null, null);

    header.next = trailer;
    trailer.prev = header;

    size = 0;
  }

  public int size() {
    return size;
  }

  // R-3.11
  public int size2() {
    int cnt = 0;
    Node cur = header;
    while (cur.next != trailer) {
      cur = cur.next;
      cnt++;
    }
    return cnt;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int first() {
    if (isEmpty()) {
      return -1;
    }
    return header.next.value;
  }

  public int last() {
    if (isEmpty()) {
      return -1;
    }
    return trailer.prev.value;
  }

  public void addFirst(int element) {
    Node newNode = new Node(element, header.next, header);

    header.next.prev = newNode;
    header.next = newNode;

    size++;
  }

  public void addLast(int element) {
    Node newNode = new Node(element, trailer, trailer.prev);

    trailer.prev.next = newNode;
    trailer.prev = newNode;

    size++;
  }

  public void removeFirst() {
    if (isEmpty()) {
      return;
    }

    header.next = header.next.next;
    header.next.prev = header;

    size--;
  }

  public void removeLast() {
    if (isEmpty()) {
      return;
    }

    trailer.prev = trailer.prev.prev;
    trailer.prev.next = trailer;

    size--;
  }

  // C-3.26
  public static DoublyLinkedList concatenate(DoublyLinkedList L, DoublyLinkedList M) {

    Node last_L = L.trailer.prev;
    Node first_M = M.header.next;

    last_L.next = first_M;
    first_M.prev = last_L;

    L.size += M.size;

    return L;
  }
}
