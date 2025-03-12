package cu.sci.cs202.week01;

public class Employee extends Person {

  private int salary;

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Employee(String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
  }

  public void print() {
    System.out.println("print here from emplyee");
  }
}
