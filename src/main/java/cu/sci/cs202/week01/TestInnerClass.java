package cu.sci.cs202.week01;

public class TestInnerClass extends Person {

  public static void main(String[] args) {
    System.out.println("jhdsf");

    InnerClass x = new InnerClass(5);

  }

  static class InnerClass {
    private int value;

    public InnerClass(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }
  }

}
