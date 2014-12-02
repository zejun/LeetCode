package com.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import com.structure.UndirectedGraphNode;

public class Graph {
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<UndirectedGraphNode, UndirectedGraphNode> record = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        
        if (node == null){
            return node;
        }
        
        Stack<UndirectedGraphNode> stack = new Stack<UndirectedGraphNode>();
        stack.push(node);
        
        //copy the node
        while (!stack.isEmpty()){
            UndirectedGraphNode temNode = stack.pop();
            record.put(temNode, new UndirectedGraphNode(temNode.label));
            ArrayList neighbors = (ArrayList)temNode.neighbors;
            
            for (int i = 0; i < neighbors.size(); i++){
                if (!record.containsKey(neighbors.get(i))){
                    UndirectedGraphNode neighbor = (UndirectedGraphNode) neighbors.get(i);
                    stack.push(neighbor);
                    record.put(neighbor, new UndirectedGraphNode(neighbor.label));
                }
            }
            
        }
        
        //copy the neibour
        for (UndirectedGraphNode key : record.keySet()){
            UndirectedGraphNode copy = record.get(key);
            ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();
            for (int i = 0; i < key.neighbors.size(); i++){
                neighbors.add(record.get(key.neighbors.get(i)));
            }
            copy.neighbors = neighbors;
        }
        
        return record.get(node);
    }

}
