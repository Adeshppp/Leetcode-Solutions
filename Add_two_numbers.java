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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode newNode=new ListNode();
        ListNode head=newNode;
        int carry=0;
        if(temp1==null){
            return temp2;
        }
        if(temp2==null){
            return temp1;
        }

        while(temp1!=null && temp2!=null){

            int x=temp1.val+temp2.val+carry;

            carry=x/10;

            newNode.next=new ListNode(x%10);
            temp1=temp1.next;
            temp2=temp2.next;
            newNode=newNode.next;
            // System.out.println("here");

            // if(temp1==null){
            //     temp2.val=temp2.val+carry;
            // }
            // if(temp2==null){
            //     temp1.val=temp1.val+carry;
            // }





        }
        while(temp1==null && temp2!=null){
            int x=temp2.val+carry;
            carry=x/10;
            newNode.next=new ListNode(x%10);
            temp2=temp2.next;
            newNode=newNode.next;
            // if(temp2==null && carry>0){
            //     newNode=new ListNode(carry,null);
            // }

        }

        while(temp1!=null && temp2==null){
            int x=temp1.val+carry;
            carry=x/10;
            newNode.next=new ListNode(x%10);
            temp1=temp1.next;
            newNode=newNode.next;
            // if(temp1==null && carry>0){
            //     newNode=new ListNode(carry,null);
            // }
        }
        if(carry>0){


            newNode.next=new ListNode(carry);
        }
        return head.next;

    }
}

//this is not the best solution out there, but this is my understanding of the Linked List