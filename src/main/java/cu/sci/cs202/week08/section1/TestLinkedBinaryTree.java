package cu.sci.cs202.week08.section1;

public class TestLinkedBinaryTree {

  public static void main(String[] args) {
    LinkedBinaryTree tree1 = new LinkedBinaryTree();

    tree1.insert(17);
    tree1.insert(8);
    tree1.insert(28);
    tree1.insert(10);
    tree1.insert(3);
    tree1.insert(9);
    tree1.insert(20);

    System.out.println("tree1 height=" + tree1.getHeight());
    System.out.println("search 15=" + tree1.search(15));
    System.out.println("search 9=" + tree1.search(9));
    System.out.println("search 27=" + tree1.search(27));
    System.out.println("search 28=" + tree1.search(28));


    LinkedBinaryTree tree2 = new LinkedBinaryTree();

    tree2.insert(3);
    tree2.insert(8);
    tree2.insert(9);
    tree2.insert(10);
    tree2.insert(17);
    tree2.insert(20);
    tree2.insert(28);

    System.out.println("tree2 height=" + tree2.getHeight());


    LinkedBinaryTree tree3 = new LinkedBinaryTree();

    tree3.insert(8);
    tree3.insert(8);
    tree3.insert(5);
    tree3.insert(3);
    tree3.insert(4);
    tree3.insert(1);
    tree3.insert(7);
    tree3.insert(6);
    tree3.insert(8);
    tree3.insert(12);
    tree3.insert(13);
    tree3.insert(10);
    tree3.insert(11);

    tree3.delete(5);
    System.out.println("tree3 height=" + tree3.getHeight());
    tree3.traversals();
  }
}
