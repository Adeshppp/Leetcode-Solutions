/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null){
            return head;
        }
                
        ListNode reverse=new ListNode();
        reverse=null;
        while(head!=null){
            ListNode newNode=new ListNode(head.val);      
            newNode.next=reverse;
            reverse=newNode;
            head=head.next;  
        }
        return reverse;
    }
    
}

//to compile and the the code, main function needed.... 

This is just a solution to leetcode problem

You can compile this code by creating main method and by passing LinkedList while calling reverseList() method.