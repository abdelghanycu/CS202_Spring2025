package cu.sci.cs202.week10;

public class P implements Comparable<P> {

  int node, wei;

  public P(int node, int wei) {
    this.node = node;
    this.wei = wei;
  }

  @Override
  public int compareTo(P o) {
    return this.wei - o.wei;
  }
}
