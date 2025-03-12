package cu.sci.cs202.week01;

public class Car {

  String name;
  String model;
  int year;
  static int countObjects = 0;

  Car(String name) {
    this.name = name;
    countObjects++;
  }

  void setName(String name) {
    this.name = name;
    System.out.println(countObjects);
  }

  public static void print() {
//    System.out.println(this.name);
  }

}
