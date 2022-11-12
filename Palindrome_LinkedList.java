/z
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
            }
        ListNode h1=head;
        ListNode reverse=new ListNode();
        reverse=null;
        while(head!=null){
            ListNode newNode=new ListNode(head.val);
            newNode.next=reverse;
            reverse=newNode;
            head=head.next;
        }
        while(h1!=null){
            if(h1.val==reverse.val){
                h1=h1.next;
                reverse=reverse.next;
            }
            else{
                return false;
            }
    }
        return true;
}
}