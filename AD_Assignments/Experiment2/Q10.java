// determine path from u to v

import java.util.*;

public class Q10 {

    static class Edge {

        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        // Check for cycle detection
        boolean[] vis = new boolean[V];
        boolean[] st = new boolean[V];
        System.out.println(detectCycle(graph, 0, vis, st));
    }

    private static boolean detectCycle(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] st) {
        vis[curr] = true;
        st[curr] = true;  // Corrected to st[curr]

        for (Edge e : graph[curr]) {
            if (st[e.dest]) {
                return true; // Cycle detected
            }
            if (!vis[e.dest]) {
                if (detectCycle(graph, e.dest, vis, st)) {
                    return true;
                }
            }
        }
        st[curr] = false;
        return false;
    }
}
