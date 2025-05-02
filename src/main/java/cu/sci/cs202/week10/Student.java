package cu.sci.cs202.week10;

public class Student implements Comparable<Student> {

  private String name;
  private int code;

  public Student(String name) {
    this.name = name;
  }

  public Student(String name, int code) {
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", code=" + code +
        '}';
  }

  @Override
  public int compareTo(Student o) {
    return this.code - o.code;
  }
}
