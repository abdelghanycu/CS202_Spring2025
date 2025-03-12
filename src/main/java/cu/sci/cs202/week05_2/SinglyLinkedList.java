package cu.sci.cs202.week05_2;

public class SinglyLinkedList {

  Bubble head;
  Bubble tail;
  int size;

  SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  // R-3.9
  public int size2() {
    if (head == null) {
      return 0;
    }
    int cnt = 1;
    Bubble cur = head;
    while (cur.next != null) {
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
    return head.value;
  }

  public int last() {
    if (isEmpty()) {
      return -1;
    }
    return tail.value;
  }

  // R-3.6
  public int secondLast() {
    if (size < 2) {
      return -1;
    }
    Bubble cur = head;
    while (cur.next.next != null) {
      cur = cur.next;
    }
    return cur.value;
  }

  public void addFirst(int element) {
    Bubble newBubble = new Bubble(element, null);
    if (isEmpty()) {
      head = newBubble;
      tail = newBubble;
    } else {
      newBubble.next = head;
      head = newBubble;
    }
    size++;
  }

  public void addLast(int element) {
    Bubble newBubble = new Bubble(element, null);
    if (isEmpty()) {
      head = newBubble;
      tail = newBubble;
    } else {
      tail.next = newBubble;
      tail = newBubble;
    }
    size++;
  }

  public void removeFirst() {
    if (isEmpty()) {
      return;
    }
    if (size == 1) {
      head = tail = null;
    } else {
      head = head.next;
    }
    size--;
  }

  public void removeLast() {
    if (isEmpty()) {
      return;
    }
    if (size == 1) {
      head = tail = null;
    } else if (size == 2) {
      head.next = null;
      tail = head;
    } else {
      Bubble cur = head;
      while (cur.next.next != null) {
        cur = cur.next;
      }
      cur.next = null;
      tail = cur;
    }
    size--;
  }

  // C-3.25
  public static SinglyLinkedList concatenate(SinglyLinkedList L, SinglyLinkedList M) {

    L.tail.next =M.head;

    return L;
  }
}
