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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode kthnode=head;
       
        for(int i=1;i<k;i++)
        {
            if(kthnode==null)
            {
                return head;
            }
            kthnode=kthnode.next;
        }
        if(kthnode==null)
        return head;
        ListNode nextNode=kthnode.next;
        kthnode.next=null;
        ListNode newhead=reverseList(head);
        ListNode nexthead=reverseKGroup(nextNode,k);
        head.next=nexthead;
        return newhead;

    }
    public ListNode reverseList(ListNode head) 
    {
       if(head==null || head.next==null) return head;
       ListNode newhead=reverseList(head.next);
       ListNode front=head.next;
       front.next=head;
       head.next=null;
       return newhead;
        
    }
 
}