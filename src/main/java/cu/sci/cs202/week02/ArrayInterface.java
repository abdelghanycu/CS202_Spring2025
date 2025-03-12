package cu.sci.cs202.week02;

public interface ArrayInterface {

  void insert(Object val);

  int size();

  boolean isEmpty();

  boolean search(Object val);

  void print();

  default void test22() {
    System.out.println("test22");
  }
}
