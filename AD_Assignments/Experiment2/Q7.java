package Experiment2;
//count all possible path from u to v
import java.util.*;
public class Q7 {
 static class Edge{
	int src;
	int dest;
	public Edge(int src, int dest){
		this.src = src;
		this.dest = dest;
	}
}

public static void main(String[] args) {
	int V =6;
	ArrayList<Edge>[] graph = new ArrayList[V];
 
	for(int i=0; i<V; i++){
		graph[i]=new ArrayList<>();
	}

	graph[0].add(new Edge(0, 3));
		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 1));

		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));

		graph[5].add(new Edge(5, 0));
		graph[5].add(new Edge(5, 2));
  

		System.out.println("Enter source and destination u and v");
	 Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		int v = sc.nextInt();
		boolean [] vis = new boolean[V];
		System.out.println(countPoss(graph,u,v,vis));
		}
		
		private static int countPoss(ArrayList<Edge>[] graph, int u, int v,boolean[] vis) {
		   if(u == v){
					  return 1;
					}
					int count=0;
					vis[u] = true;
					for(Edge e:graph[u]){
       if(!vis[e.dest])
							{
								count+=countPoss(graph, e.dest, v, vis);
							}
					}
					vis[u]=false;
					return count;
		}
	
}