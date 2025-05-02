package cu.sci.cs202.week10;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Graph2 {

  private int n;
  private List<List<P>> adj;


  public Graph2(int n) {
    this.n = n;
    adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }
  }

  public void addEdge(int u, int v, int w) {
    adj.get(u).add(new P(v, w));
    adj.get(v).add(new P(u, w));
  }

  public void dijkstra(int source) {
    int[] cst = new int[n];
    for (int i = 0; i < n; i++) {
      cst[i] = Integer.MAX_VALUE;
    }
    cst[source] = 0;

    PriorityQueue<P> pq = new PriorityQueue<>();
    pq.add(new P(source, 0));

    while (!pq.isEmpty()) {
      P cur = pq.poll();

      for (int i = 0; i < adj.get(cur.node).size(); i++) {
        P x = adj.get(cur.node).get(i);
        if (cst[x.node] > x.wei + cur.wei) {
          cst[x.node] = x.wei + cur.wei;
          pq.add(new P(x.node, cst[x.node]));
        }
      }

    }

    for (int i = 0; i < n; i++) {
      System.out.println("the wight from " + source + " to " + i + " is = " + cst[i]);
    }
  }

}

