package cu.sci.cs202.week02;

public class Test3 {

  public static void main(String[] args) {
    AbdelghanyArray<Integer, Boolean> arr = new AbdelghanyArray<Integer, Boolean>();
    arr.insert(5);
    System.out.println(arr.size());
    int x = arr.get(0);
    System.out.println("x= " + x);
    Boolean t = arr.testtest(true);
    System.out.println("t= " + t);
  }
}
