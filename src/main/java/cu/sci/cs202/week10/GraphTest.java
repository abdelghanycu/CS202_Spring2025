package cu.sci.cs202.week10;

import java.util.Scanner;

public class GraphTest {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();

    Graph gh = new Graph(n);

    for (int i = 0; i < m; i++) {
      int u = in.nextInt();
      int v = in.nextInt();

      gh.addEdge(u, v);
    }

    System.out.println("queries for DFS:");
    int q = in.nextInt();
    while (q-- > 0) { // for(int i = 0; i < q; i++)
      int st = in.nextInt();
      int ed = in.nextInt();

      System.out.println("DFS " + st + " " + ed + " res=" + gh.DFS(st, ed));

      System.out.println();
    }

    System.out.println("queries for BFS:");
    q = in.nextInt();
    while (q-- > 0) { // for(int i = 0; i < q; i++)
      int st = in.nextInt();

      System.out.println("BFS " + st + " res=" + gh.BFS(st));

      System.out.println();
    }

    System.out.println();

  }
}

/*

11 9
0 1
1 2
2 3
2 5
3 4
5 6
7 9
7 8
8 10


 */