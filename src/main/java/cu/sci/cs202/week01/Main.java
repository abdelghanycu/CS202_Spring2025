package cu.sci.cs202.week01;

public class Main {

  public static void main(String[] args) {
    Car c = new Car("BMW");
    c.setName("abdo");


    Car c2 = new Car("BMW");


    Car c3 = new Car("BMW");

    System.out.println(c.countObjects);
    System.out.println(c2.countObjects);
    System.out.println(c3.countObjects);
    System.out.println(Car.countObjects);
  }
}