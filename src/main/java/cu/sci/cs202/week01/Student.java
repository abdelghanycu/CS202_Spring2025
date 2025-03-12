package cu.sci.cs202.week01;

public class Student<Henksh, T> {

  Henksh val;
  T x;

  public Student() {
  }

  public Student(Henksh val) {
    this.val = val;
  }

  public Henksh getVal() {
    return val;
  }

  public void setVal(Henksh val) {
    this.val = val;
  }
}
