package com.solution;

import com.structure.ListNode;

public class SortLinkedList {
	
	public static ListNode findMiddle(ListNode head){
		ListNode fast = head.next;
		ListNode slow = head;
		
		while(fast!=null&&fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	
	public static ListNode sortList(ListNode head){
		

		
        //check wheather the linked list is null
        if(head==null||head.next==null){
            return head;
        }else{
        	
        	ListNode mid = findMiddle(head);
        	
        	ListNode right = sortList(mid.next);
        	mid.next=null;
        	ListNode left = sortList(head);
        	
        	return mergeSorted(left,right);
        	
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
        return size+1;
    }
    
    //merge two sorted linked list
    public static ListNode mergeSorted(ListNode l1, ListNode l2){
        
//        if(l1==null){
//            return l2;
//        }
//        
//        if(l2==null)
//            return l1;
//           
//       if(l1.val<l2.val){
//           l1.next = mergeSorted(l1.next,l2);
//           return l1;
//       }else{
//           l2.next = mergeSorted(l1,l2.next);
//           return l2;
//       }
    	
    	ListNode dummy = new ListNode(0);
    	ListNode tail = dummy;
    	
    	while(l1!=null&&l2!=null){
    		if(l1.val<l2.val){
    			tail.next = l1;
    			l1=l1.next;
    		}else{
    			tail.next = l2;
    			l2=l2.next;
    		}
    		tail = tail.next;
    	}
    	
    	if(l1!=null){
    		tail.next=l1;
    	}else if(l2!=null){
    		tail.next=l2;
    	}
    	
    	return dummy.next;
    }
}
