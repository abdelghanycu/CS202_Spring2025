package cu.sci.cs202.week10;

import java.util.Scanner;

public class Graph2Test {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();

    Graph2 gh = new Graph2(n);

    for (int i = 0; i < m; i++) {
      int u = in.nextInt();
      int v = in.nextInt();
      int w = in.nextInt();

      gh.addEdge(u, v, w);
    }

    gh.dijkstra(0);

  }
}

/*
5 5
0 1 4
0 2 8
1 4 6
2 3 2
4 3 10
 */