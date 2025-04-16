package cu.sci.cs202.week08.section1;

public class LinkedBinaryTree {

  private Node root;
  private int sz;

  public LinkedBinaryTree() {
    root = null;
    sz = 0;
  }

  public boolean isEmpty() {
    return sz == 0;
  }

  public int size() {
    return sz;
  }

  public void insert(int value) {
    if (root == null) {
      root = new Node(value, null, null);
      sz++;
    } else {
      Node current = root;
      while (true) {
        if (current.getValue() >= value) {
          if (current.getLeft() == null) {
            current.setLeft(new Node(value, null, null));
            sz++;
            break;
          }
          current = current.getLeft();
        } else {
          if (current.getRight() == null) {
            current.setRight(new Node(value, null, null));
            sz++;
            break;
          }
          current = current.getRight();
        }
      }
    }
  }

  public boolean search(int value) {
    Node current = root;
    while (current != null) {
      if (current.getValue() > value) {
        current = current.getLeft();
      } else if (current.getValue() < value) {
        current = current.getRight();
      } else {
        return true;
      }
    }
    return false;
  }

  public void delete(int value) {
    if (!search(value)) {
      return;
    }
    Node parent = root;
    Node current = root;
    while (current != null) {
      if (current.getValue() > value) {
        parent = current;
        current = current.getLeft();
      } else if (current.getValue() < value) {
        parent = current;
        current = current.getRight();
      } else {
        if (current == root) {
          root = null;
          break;
        }
        if (current.getLeft() == null && current.getRight() == null) {
          if (parent.getLeft() == current) {
            parent.setLeft(null);
          } else {
            parent.setRight(null);
          }
        } else if (current.getLeft() != null && current.getRight() == null) {
          if (parent.getLeft() == current) {
            parent.setLeft(current.getLeft());
          } else {
            parent.setRight(current.getLeft());
          }
        } else if (current.getLeft() == null && current.getRight() != null) {
          if (parent.getLeft() == current) {
            parent.setLeft(current.getRight());
          } else {
            parent.setRight(current.getRight());
          }
        } else {
          Node maxNode = getMax(current.getLeft());
          maxNode.setRight(current.getRight());

          parent.setLeft(current.getLeft());

        }
        break;
      }
    }
    sz--;
  }

  private Node getMax(Node node) {
    while (node.getRight() != null) {
      node = node.getRight();
    }
    return node;
  }

  public int getHeight() {
    return getHeight(root);
  }

  private int getHeight(Node current) {
    int height = 0;
    if (current != null) {
      int leftHeight = getHeight(current.getLeft());
      int rightHeight = getHeight(current.getRight());
      height = Math.max(leftHeight, rightHeight) + 1;
    }
    return height;
  }

  public void traversals() {
    if (root != null) {
      System.out.println("inOrder");
      inOrder(root);
      System.out.println("preOrder");
      preOrder(root);
      System.out.println("postOrder");
      postOrder(root);
    }
  }

  private void preOrder(Node node) {
    System.out.println(node.getValue());
    if (node.getLeft() != null) {
      preOrder(node.getLeft());
    }
    if(node.getRight() != null) {
      preOrder(node.getRight());
    }
  }

  private void inOrder(Node node) {
    if (node.getLeft() != null) {
      inOrder(node.getLeft());
    }
    System.out.println(node.getValue());
    if(node.getRight() != null) {
      inOrder(node.getRight());
    }

  }

  private void postOrder(Node node) {
    if (node.getLeft() != null) {
      postOrder(node.getLeft());
    }
    if(node.getRight() != null) {
      postOrder(node.getRight());
    }
    System.out.println(node.getValue());
  }
}
