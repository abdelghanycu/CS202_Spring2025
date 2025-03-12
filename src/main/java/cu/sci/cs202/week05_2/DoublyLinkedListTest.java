package cu.sci.cs202.week05_2;

public class DoublyLinkedListTest {

  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();

    list.addFirst(9);
    list.addFirst(11);

    list.addLast(55);

    list.removeFirst();

    list.addFirst(13);

    list.addLast(66);

    list.removeLast();

    list.addFirst(15);

    System.out.println(list.size());
    System.out.println(list.size2());


    DoublyLinkedList list1 = new DoublyLinkedList();
    list1.addLast(1);
    list1.addLast(2);
    list1.addLast(3);
    DoublyLinkedList list2 = new DoublyLinkedList();
    list1.addLast(5);
    list1.addLast(6);
    list1.addLast(7);

    DoublyLinkedList list3 = DoublyLinkedList.concatenate(list1, list2);
  }
}
