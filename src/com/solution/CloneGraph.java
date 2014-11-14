package com.solution;

import java.util.HashMap;
import java.util.Stack;

import com.structure.*;

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */

public class CloneGraph {
	
	HashMap<UndirectedGraphNode,UndirectedGraphNode> copied;
	
	//first solution with DFS 
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		
		copied = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		
		
		return node;
    }
	
	public UndirectedGraphNode DFSHelper(UndirectedGraphNode node,Stack<UndirectedGraphNode> record){
		
		
		
		return null;
	}

}
