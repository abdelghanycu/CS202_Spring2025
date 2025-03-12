package cu.sci.cs202.week01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {

  public static void main(String[] args) throws Exception {
    Scanner in = null;
    PrintWriter printWriter = null;
    try {
      File file = new File("C:\\Users\\Abdelghany\\Desktop\\cs2020.txt");
       in = new Scanner(file);
      String s1 = in.next();
//      int x = in.nextInt();
      String s2 = in.next();
      File file1 = new File("C:\\Users\\Abdelghany\\Desktop\\print.txt");
       printWriter = new PrintWriter(file1);
      System.out.println(s2 + "&&&" + s1);
      printWriter.println(s2 + "&&&" + s1);
    }
     catch (FileNotFoundException | InputMismatchException henksh) {
      throw new Exception("يا حيوان روح صلح اسم الفيل");
//      System.out.println(henksh.getMessage() + henksh);
    }
//    catch(InputMismatchException ex) {
//      System.out.println("here" + ex + "/n*****");
//    }
    catch (Exception ex) {
//      throw ex;
    }
    finally {
      if(in != null) {
        in.close();
      }
      if(printWriter != null) {
        printWriter.close();
      }
    }
  }
}
