package cu.sci.cs202.week01;

public class TestShape {

  public static void main(String[] args) {
    Circle c = new Circle(5);
    System.out.println(c.getArea());

    Square s = new Square(5);
    System.out.println(s.getArea());
  }
}
