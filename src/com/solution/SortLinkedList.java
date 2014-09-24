package com.solution;

import com.structure.ListNode;

public class SortLinkedList {

	
	public static ListNode sortList(ListNode head){
		

        //check wheather the linked list is null
        if(head==null||head.next==null){
            return head;
        }else{
            int size = countSize(head);
            if(size==1)
                return head;
            else{
                ListNode l1 = head;
                ListNode l2 = head;
                
                
                for(int i=0;i<size/2;i++){
                    l2 = l2.next;
                }
                
                int subSize1 = size/2;
                int subSize2 = size-size/2;
                
                ListNode result = mergeSorted(sortList(l1,subSize1),sortList(l2,subSize2));
                
                return result;
                
            }
            
            
        }
        
	}
	
	public static ListNode sortList(ListNode h1, int size){
        
        if(size==1){
            return h1;
        }else{
            ListNode l1 = h1;
            ListNode l2 = h1;
            int subSize1 = size/2;
            int subSize2 = size-size/2;
            
            for(int i=0;i<size/2;i++){
                l2 = l2.next;
            }
            
            ListNode result = mergeSorted(sortList(l1,subSize1),sortList(l2,subSize2));
            
            return result;
        }
        
    }
	
	public static int countSize(ListNode node){
        int size = 0;
        if(node!=null){
            
            while(node.next!=null){
                node = node.next;
                size++;
            }
        }
        return size;
    }
    
    //merge two sorted linked list
    public static ListNode mergeSorted(ListNode l1, ListNode l2){
        
        if(l1==null){
            return l2;
        }
        
        if(l2==null)
            return l1;
           
       if(l1.val<l2.val){
           l1.next = mergeSorted(l1.next,l2);
           return l1;
       }else{
           l2.next = mergeSorted(l1,l2.next);
           return l2;
       }
    }
}
