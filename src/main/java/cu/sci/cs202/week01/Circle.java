package cu.sci.cs202.week01;

public class Circle implements Shape {

  double radius;

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public Circle(double radius) {
    this.radius = radius;
  }
}
