package cu.sci.cs202.week05;

public class TestDoublyLinkedList {

  public static void main(String[] args) {
    DoublyLinkedList list2 = new DoublyLinkedList();

    list2.addFirst(500);
    list2.addFirst(501);
    list2.addFirst(502);
    list2.addFirst(503);


    DoublyLinkedList list = new DoublyLinkedList();

    list.addFirst(5);
    list.addFirst(7);
    list.addLast(9);
    list.addFirst(11);
    list.addLast(55);
    list.addFirst(13);

    list.removeFirst();
    list.removeLast();

    System.out.println(list.size2());

    DoublyLinkedList newList = DoublyLinkedList.concatenate(list, list2);
    System.out.println(newList.size2());
  }
}
