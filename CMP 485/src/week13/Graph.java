package week13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
	
	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	
	public Node getNode(int id) {
		
		return nodeLookup.get(id);
	}
	
	public void addEdge(int source, int destination) {
		
		Node s = getNode(source);
		Node d = getNode(destination);
		
		s.adjacent.add(d);
	}
	
	public boolean hasPathDFS(int source, int destination) {
		
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d, visited);
	}
	
	public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
		
		if(visited.contains(source.id)) {
			
			return false;
		}
		
		visited.add(source.id);
		if(source == destination) {
			
			return true;
		}
		
		for(Node child : source.adjacent) {
			
			if(hasPathDFS(child, destination, visited)) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public boolean hasPathBFS(Node source, Node destination) {
		
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		
		HashSet<Integer> visited = new HashSet<Integer>();
		
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty()) {
			
			Node node = nextToVisit.remove();
			
			if(node == destination) {
				
				return true;
			}
			
			if(visited.contains(node.id)) {
				
				continue;
			}
			
			visited.add(node.id);
			
			for(Node child : node.adjacent) {
				
				nextToVisit.add(child);
			}
		}
		
		return false;
	}

}
