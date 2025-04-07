package CSW_2.LAB_21;

import java.util.ArrayList;
import java.util.List;

public class p2_adjList {

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);

        System.out.println("Adjacency List Representation");
        displayAdjList(adj);

        System.out.println("\nDFS Traversal starting from node 0:");
        List<Integer> dfsResult = DFS(adj);
        System.out.println(dfsResult);
    }

    private static void addEdge(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i); // Since it's an undirected graph
    }

    private static List<Integer> DFS(List<List<Integer>> adj) {
        boolean[] vis = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();
        dfsRec(adj, vis, 0, res);
        return res;
    }

    private static void dfsRec(List<List<Integer>> adj, boolean[] vis, int node, List<Integer> res) {
        vis[node] = true;
        res.add(node);
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfsRec(adj, vis, neighbor, res);
            }
        }
    }

    private static void displayAdjList(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
