package cu.sci.cs202.week05;

public class SinglyLinkedList {

  Bubble head;
  Bubble tail;
  int size;

  SinglyLinkedList() {
    head = new Bubble(0, null);
    tail = new Bubble(0, null);

    head.next = tail;

    size = 0;
  }

  public int size() {
    return size;
  }

  // R-3.9
  public int size2(){
    int cnt = 0;
    Bubble curr = head;
    while (curr.next != tail) {
      curr = curr.next;
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
    return head.next.value;
  }

  public int last() {
    if (isEmpty()) {
      return -1;
    }
    Bubble curr = head.next;
    while (curr.next != tail) {
      curr = curr.next;
    }
    return curr.value;
  }

  // R-3.6
  public int secondLast() {
    if (size < 1) {
      return -1;
    }
    Bubble curr = head.next;
    while (curr.next.next != tail) {
      curr = curr.next;
    }
    return curr.value;
  }

  public void addFirst(int element) {
    Bubble newElement = new Bubble(element, null);

    if (isEmpty()) {
      head.next = newElement;
      newElement.next = tail;
    } else {
      newElement.next = head.next;
      head.next = newElement;
    }
    size++;
  }

  public void addLast(int element) {
    Bubble newElement = new Bubble(element, null);

    if (isEmpty()) {
      head.next = newElement;
      newElement.next = tail;
    } else {
      Bubble curr = head.next;
      while (curr.next != tail) {
        curr = curr.next;
      }
      curr.next = newElement;
      newElement.next = tail;
    }
    size++;
  }

  public void removeFirst() {
    if (isEmpty()) {
      return;
    }
    head.next = head.next.next;
    size--;
  }

  // C-3.25
  public static SinglyLinkedList concatenate(SinglyLinkedList L, SinglyLinkedList M) {
    Bubble last_L = L.head.next;
    while (last_L.next != L.tail) {
      last_L = last_L.next;
    }

    Bubble first_M = M.head.next;

    last_L.next = first_M;

    return L;
  }
}
