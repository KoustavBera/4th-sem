import java.util.*;

public class q6_Graph {
	private int vertices; // Number of vertices
	private int[][] adjMatrix; // Adjacency Matrix
	private List<List<Integer>> adjList; // Adjacency List

	// Constructor to initialise the graph
	public q6_Graph(int vertices) {
		this.vertices = vertices;
		adjMatrix = new int[vertices][vertices];
		adjList = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	// Method to add an edge to both representations
	public void addEdge(int src, int dest) {
		// For adjacency matrix
		adjMatrix[src][dest] = 1;
		adjMatrix[dest][src] = 1; // For undirected graph

		// For adjacency list
		adjList.get(src).add(dest);
		adjList.get(dest).add(src); // For undirected graph
	}

	// Display Adjacency Matrix
	public void displayAdjMatrix() {
		System.out.println("Adjacency Matrix : ");
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Display Adjacency List
	public void displayAdjList() {
		System.out.println("Adjacency List");
		for (int i = 0; i < vertices; i++) {
			System.out.print(i + "->");
			for (int node : adjList.get(i)) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
	}

	// Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of vertices: ");
		int v = sc.nextInt();
		q6_Graph graph = new q6_Graph(v);

		System.out.print("Enter number of edges: ");
		int e = sc.nextInt();

		System.out.println("Enter edges (src dest):");
		for (int i = 0; i < e; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			graph.addEdge(src, dest);
		}

		System.out.println();
		graph.displayAdjMatrix();
		System.out.println();
		graph.displayAdjList();

		sc.close();
	}
}
