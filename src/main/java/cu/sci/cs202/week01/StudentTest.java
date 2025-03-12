package cu.sci.cs202.week01;

import java.util.ArrayList;

public class StudentTest {

  public static void main(String[] args) {
    Character x;
    Student<Integer, String> s = new Student<Integer, String>(5);
    System.out.println(s.getVal());


    Student<String, String> s1 = new Student<String, String>("jghfgjgfgj");
    System.out.println(s1.getVal());

    ArrayList<Integer> list = new ArrayList<Integer>();
  }
}
