package Experiment2;
//determine path from u to v
import java.util.*;
public class Q9 {
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
  
		System.out.println(findDistance(graph, 0, 4, new boolean[V]));

		}
		
		private static int findDistance(ArrayList<Edge>[] graph, int u, int v, boolean[] vis){
		 Queue<Integer> q = new LinkedList<>();
			q.add(u);
			vis[u] = true;
   int level = 0;

			while(!q.isEmpty()){
				int size = q.size();
				while(size-- >0){
					int curr = q.remove();
					if(curr == v){
						return level;
					}
			
				for(Edge e: graph[curr]){
					if(!vis[e.dest]){
						q.add(e.dest);
						vis[e.dest] = true;
					}
				}		
				}
				level++;
			}
			return level;	
		}
	
}