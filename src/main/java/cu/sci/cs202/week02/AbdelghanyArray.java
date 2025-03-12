package cu.sci.cs202.week02;

public class AbdelghanyArray<T, K> implements ArrayInterface {

  private Object[] arr;
  private int ele;
  private int capacity;

  public AbdelghanyArray() {
    capacity = 2;
    arr = new Object[capacity];
    ele = 0;
  }

  public K testtest(K x) {
    return x;
  }

  public AbdelghanyArray(int capacity) {
    this.capacity = capacity;
    arr = new Object[capacity];
    ele = 0;
  }

  public T get(int index) {
    return (T)arr[index];
  }

  public void insert(Object val) {
//    System.out.println("Abdelghany");
    if(ele == arr.length) {
      copy();
    }
    arr[ele] = val;
    ele++;
  }

  private void copy(){
    Object[] newArr = new Object[arr.length * capacity];
    for(int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    arr = newArr;
  }

  public int size() {
    return ele;
  }

  public boolean isEmpty() {
    return ele == 0;
  }

  public boolean search(Object val) {
    for(int i = 0; i < ele; i++) {
      if(arr[i].equals(val)) {
        return true;
      }
    }
    return false;
  }

  public void print() {
    for(int i = 0; i < ele; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public void test22() {
    System.out.println("test24");
  }
}
