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
    public ListNode middleNode(ListNode head) 
    {
        ListNode temp=head;
        int c=0;
        int mid;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        mid=(c/2)+1;
        temp=head;
        int k=0;
        while(temp!=null)
        {
            k++;
            if(k==mid)
            {
                break;
            }
            temp=temp.next;
        }
        return temp;

        
    }
}