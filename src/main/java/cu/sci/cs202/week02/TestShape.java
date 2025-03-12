package cu.sci.cs202.week02;

public class TestShape {

  public static void main(String[] args) {
    Shape circle = new Circle(5);
    System.out.println(((Circle)circle).getArea());
    System.out.println(circle.getPerimeter());

    System.out.println("----------------");

    Shape square = new Square(5);
    System.out.println(((Square)square).getArea());
    System.out.println(square.getPerimeter());

    Shape[] shapes = new Shape[4];
    shapes[0] = new Circle(9);
    shapes[1] = new Square(5);
    shapes[2] = new Circle(14);
    for (int i = 0; i < shapes.length; i++) {
      if(shapes[i] instanceof Circle) {
        System.out.println(((Circle)shapes[i]).getArea());
      }else if(shapes[i] instanceof Square) {
        System.out.println(((Square)shapes[i]).getArea());
      }
//      System.out.println(shapes[i].getArea());
      System.out.println(shapes[i].getPerimeter());
    }
  }
}
