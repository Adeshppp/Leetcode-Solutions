/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode n1=new ListNode();
        ListNode n2=new ListNode();
        n1=head;
        n2=head;
        if(head==null){
            return false;
        }
        while(n1.next!=null && n1.next.next!=null){
            n1=n1.next.next;
            n2=n2.next;
            if(n1==n2){
                return true;
            }
        }
        return false;
        
    }
}