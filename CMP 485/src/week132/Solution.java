package week132;

import java.util.Arrays;
import java.util.LinkedList;

import week13.Node;

public class Solution {
	
	public static class Graph {
		
		private Node[] nodes;
		private static int EDGE_DISTANCE = 6;
		
		public Graph(int size) {
			
			this.nodes = new Node[size];
		}
		
		private class Node {
			 
			private int id;
			LinkedList<Integer> adjacent = new LinkedList<Integer>();
			
			public Node(int id) {
				
				this.id = id;
			}
		}
		
		public void addNode(int id) {
			
			Node node = new Node(id);
			
			nodes[id] = node;
		}
		
		private Node getNode(int id) {
			
			return nodes[id];
		}
		
		public void addEdge(int first, int second) {
			
			Node s = getNode(first);
			Node d = getNode(second);
			
			s.adjacent.add(d.id);
		}
		
		public int [] shortestReach(int startId) {
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(startId);
			
			int [] distances = new int [nodes.length];
			
			Arrays.fill(distances, -1);
			
			distances[startId] = 0;
			
			while(!queue.isEmpty()) {
				
				int node = queue.poll();
				
				for(int neighboor : nodes[node].adjacent) {
					
					if(distances[neighboor] == -1) {
						
						distances[neighboor] = distances[node] + EDGE_DISTANCE;
						
						queue.add(neighboor);
					}
				}
				
			}
			
			return distances;
		}
	}
	
	public static void main(String [] args) {
		
		Graph g = new Graph(5);
		
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		g.addNode(4);
		
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(3, 4);
		
		int [] results = g.shortestReach(1);
		
		System.out.println(Arrays.toString(results));
	}

}
