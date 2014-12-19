package com.solution;

import java.util.List;

import com.structure.ListNode;

public class MeregeKSortedList {
	
	public static ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        
        if (lists == null || lists.size() == 0){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        int size = lists.size();
        
        
        while (size != 0){
            int min = Integer.MAX_VALUE;
            int index = 0;
            boolean check = true;
            for (int i = 0; i < lists.size(); i++){
                if (lists.get(i) != null && lists.get(i).val < min){
                    index = i;
                } else if (lists.get(i) == null){
                    size --;
                    System.out.println("removed ");
                    if (size == 0){
                        check = false;
                        break;
                    }
                }
            }
            System.out.println("Size " + size);
            if (!check){
            	break;
            }
            
            if (lists.get(index) != null){
            	current.next = new ListNode(lists.get(index).val);
                current = current.next;
                lists.set(index, lists.get(index).next);
                
                
            } else {
                lists.set(index, null);
            }
            
            
        }
        
        return dummy.next;
    }

}
