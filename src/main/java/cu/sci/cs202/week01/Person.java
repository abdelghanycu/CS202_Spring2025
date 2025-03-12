package cu.sci.cs202.week01;

public class Person {//extends Object {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void print() {
    System.out.println("name=" + name + ", age=" + age);
  }

  public void print22() {
    System.out.println(toString());
  }
}
