package cu.sci.cs202.week10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {

  private int n;
  private List<List<Integer>> adj;


  public Graph(int n) {
    this.n = n;
    adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }
  }

  public void addEdge(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  public boolean DFS(int start, int end) {
    boolean[] vis = new boolean[n];
    Stack<Integer> st = new Stack<>();
    st.add(start);
    vis[start] = true;
    while (!st.isEmpty()) {
      int cur = st.pop();
      System.err.println(cur);

      if (cur == end) {
        return true;
      }

      for (int i = 0; i < adj.get(cur).size(); i++) {
        int x = adj.get(cur).get(i);
        if (!vis[x]) {
          vis[x] = true;
          st.add(x);
        }
      }
    }
    return false;
  }

  public int BFS(int start) {
    boolean[] vis = new boolean[n];
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    vis[start] = true;

    int level = 0;
    while (!q.isEmpty()) {
      int sz = q.size();
      while (sz-- > 0) {
        int cur = q.poll();
        System.err.print(cur + " ");
        for (int i = 0; i < adj.get(cur).size(); i++) {
          int x = adj.get(cur).get(i);
          if (!vis[x]) {
            vis[x] = true;
            q.add(x);
          }
        }
      }
      System.err.println();
      level++;
    }
    return level;
  }
}
