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
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast =head;
        while(fast.next != null && fast.next.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverselist(slow.next);
        ListNode first=head,second=newhead;
        while(second!=null)
        {
            if(first.val!=second.val)
            return false;
            first=first.next;
            second=second.next;
        
        }
        reverselist(newhead);
        return true;        
    }
    public ListNode reverselist(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode newhead=reverselist(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
}