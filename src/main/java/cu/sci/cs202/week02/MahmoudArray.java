package cu.sci.cs202.week02;//package cs202.week02;
//
//public class MahmoudArray implements ArrayInterface {
//
//  private int[] arr;
//  private int ele;
//  private int capacity;
//
//  public MahmoudArray() {
//    capacity = 2;
//    arr = new int[capacity];
//    ele = 0;
//  }
//
//  public MahmoudArray(int capacity) {
//    this.capacity = capacity;
//    arr = new int[capacity];
//    ele = 0;
//  }
//
//  public void insert(int val) {
//    System.out.println("Mahmoud");
//    if(ele == arr.length) {
//      copy();
//    }
//    arr[ele] = val;
//    ele++;
//  }
//
//  private void copy(){
//    int[] newArr = new int[arr.length + 1];
//    for(int i = 0; i < arr.length; i++) {
//      newArr[i] = arr[i];
//    }
//    arr = newArr;
//  }
//
//  public int size() {
//    return ele;
//  }
//
//  public boolean isEmpty() {
//    return ele == 0;
//  }
//
////  public boolean search(int val) {
////    for(int i = 0; i < ele; i++) {
////      if(arr[i] == val) {
////        return true;
////      }
////    }
////    return false;
////  }
//
//  public void print() {
//    for(int i = 0; i < ele; i++) {
//      System.out.print(arr[i] + " ");
//    }
//    System.out.println();
//  }
//}
