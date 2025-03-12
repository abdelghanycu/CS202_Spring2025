package cu.sci.cs202.week01;

public class TestPerson {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.print22();

    Person p2 = new Employee("abdo", 55, 99);
    p2.print22();
    if(p2 instanceof Employee) {
      ((Employee) p2).getSalary();
    }

    Employee employee = new Employee("abdelghany", 44, 45);
    employee.print();
    employee.print22();


  }
}
