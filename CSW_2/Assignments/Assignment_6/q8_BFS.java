import java.util.*;

public class q8_BFS {
	private int vertices;
	private ArrayList<ArrayList<Integer>> adjList;

	// Constructor to initialize the graph
	public q8_BFS(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		// Create an empty list for each vertex
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	// Method to add an undirected edge
	public void addEdge(int src, int dest) {
		adjList.get(src).add(dest);
		adjList.get(dest).add(src);
	}

	// Display Adj list
	public void displayAdjList() {
		System.out.println("\nAdjacency List:");
		for (int i = 0; i < vertices; i++) {
			System.out.print(i + " -> ");
			for (int neighbor : adjList.get(i)) {
				System.out.print(neighbor + " ");
			}
			System.out.println();
		}
	}

	// BFS
	public void BFS(int startVertex) {
		boolean[] visited = new boolean[vertices];
		Queue<Integer> queue = new LinkedList<>();

		visited[startVertex] = true;
		queue.add(startVertex);
		System.out.print("BFS Traversal starting from vertex " + startVertex + ":");
		while (!queue.isEmpty()) {
			int current = queue.remove();
			System.out.print(current + " ");

			for (int neighbor : adjList.get(current)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		System.out.println();
}
public class Graph {
	private int vertices;
	private ArrayList<ArrayList<Integer>> adjList;

	// Constructor to initialize the graph
	public Graph(int vertices) {
		this.vertices = vertices;
		adjList = new ArrayList<>();

		// Initialize adjacency list for each vertex
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	// Method to add an undirected edge
	public void addEdge(int src, int dest) {
		adjList.get(src).add(dest); // Add edge src → dest
		adjList.get(dest).add(src); // Add edge dest → src (undirected)
	}

	// Display the adjacency list
	public void displayAdjList() {
		System.out.println("\nAdjacency List:");
		for (int i = 0; i < vertices; i++) {
			System.out.print(i + " -> ");
			for (int neighbor : adjList.get(i)) {
				System.out.print(neighbor + " ");
			}
			System.out.println();
		}
	}

	// BFS traversal using Queue (LinkedList)
	public void BFS(int startVertex) {
		boolean[] visited = new boolean[vertices]; // Track visited nodes
		Queue<Integer> queue = new LinkedList<>(); // Use LinkedList as a queue

		visited[startVertex] = true;
		queue.offer(startVertex); // Enqueue the start vertex

		System.out.print("BFS Traversal starting from vertex " + startVertex + ": ");

		while (!queue.isEmpty()) {
			int current = queue.poll(); // Dequeue
			System.out.print(current + " ");

			for (int neighbor : adjList.get(current)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.offer(neighbor); // Enqueue unvisited neighbors
				}
			}
		}

		System.out.println();
	}

	// Main method to build and traverse the graph
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of vertices: ");
		int v = sc.nextInt();

		System.out.print("Enter number of edges: ");
		int e = sc.nextInt();

		Graph graph = new Graph(v);

		System.out.println("Enter " + e + " edges (src dest):");
		for (int i = 0; i < e; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			graph.addEdge(src, dest);
		}

		graph.displayAdjList();

		System.out.print("Enter start vertex for BFS: ");
		int start = sc.nextInt();

		graph.BFS(start);

		sc.close();
	}
}
