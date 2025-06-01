import java.util.*;

public class q7_GraphDFS {

	private int vertices;
	private ArrayList<ArrayList<Integer>> adjList;

	// Constructor
	public q7_GraphDFS(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();
		// Intialize list for each vertex
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	// Add undirected edge
	public void addEdge(int src, int dest) {
		adjList.get(src).add(dest);
		adjList.get(dest).add(src);
	}

	public void readGraph(Scanner sc, int edges) {
		System.out.println("Enter " + edges + " edges (src dest):");
		for (int i = 0; i < edges; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			addEdge(src, dest);
		}
	}

	public void displayAdjList() {
		System.out.println("\nAdjancency List: ");
		for (int i = 0; i < vertices; i++) {
			System.out.print(i + " -> ");
			for (int neighbour : adjList.get(i)) {
				System.out.print(neighbour + " ");
			}
			System.out.println();
		}
	}

	// DFS
	public void DFS(int startVertex) {
		boolean[] visited = new boolean[vertices];
		System.out.print("DFS Traversal starting from vertex " + startVertex + ":");
		dfsHelper(startVertex, visited);
		System.out.println();
	}

	private void dfsHelper(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");

		for (int neighbour : adjList.get(v)) {
			if (!visited[neighbour]) {
				dfsHelper(neighbour, visited);
			}
		}
	}

	// Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int v = sc.nextInt();

		System.out.print("Enter number of edges: ");
		int e = sc.nextInt();

		q7_GraphDFS graph = new q7_GraphDFS(v);
		graph.readGraph(sc, e);
		graph.displayAdjList();
		graph.DFS(0);

		sc.close();
	}
}
