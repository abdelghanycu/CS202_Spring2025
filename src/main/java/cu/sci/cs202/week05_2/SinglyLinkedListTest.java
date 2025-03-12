package cu.sci.cs202.week05_2;

public class SinglyLinkedListTest {

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
//    System.out.println();

    SinglyLinkedList list = new SinglyLinkedList();

    list.addFirst(9);

    list.removeFirst();

    list.addFirst(11);
    list.addLast(55);

    list.removeFirst();

    list.addFirst(13);
    list.addLast(66);
    list.addFirst(15);

    System.out.println(list.secondLast());
    System.out.println(list.size());
    System.out.println(list.size2());

    SinglyLinkedList list1 = new SinglyLinkedList();
    list1.addLast(1);
    list1.addLast(2);
    list1.addLast(3);
    SinglyLinkedList list2 = new SinglyLinkedList();
    list1.addLast(5);
    list1.addLast(6);
    list1.addLast(7);

    SinglyLinkedList list3 = SinglyLinkedList.concatenate(list1, list2);
  }
}
