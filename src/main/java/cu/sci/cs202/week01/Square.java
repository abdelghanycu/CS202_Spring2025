package cu.sci.cs202.week01;

public class Square implements Shape {
  double length;

  public Square(double length) {
    this.length = length;
  }
  public double getArea() {
    return length * length;
  }
}
