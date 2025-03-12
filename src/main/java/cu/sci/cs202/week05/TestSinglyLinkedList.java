package cu.sci.cs202.week05;

public class TestSinglyLinkedList {

  public static void main(String[] args) {
//    Bubble b1 = new Bubble(5, null);
//    Bubble b2 = new Bubble(7, null);
//    Bubble b3 = new Bubble(9, null);
//
//    b1.next = b2;
//    b2.next = b3;
//
//    b1.next = b1.next.next;
//
//    System.out.println("test");

    SinglyLinkedList list2 = new SinglyLinkedList();

    list2.addLast(100);
    list2.addLast(101);
    list2.addLast(102);
    list2.addLast(103);

    SinglyLinkedList list = new SinglyLinkedList();

    list.addLast(5);
    list.addLast(7);

    list.removeFirst();

    list.addFirst(99);

    list.addLast(9);
    list.addLast(11);

    System.out.println(list.secondLast());
    System.out.println(list.size2());

    SinglyLinkedList newList = SinglyLinkedList.concatenate(list, list2);
    System.out.println();
  }
}
