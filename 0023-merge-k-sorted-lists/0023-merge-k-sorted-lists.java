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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for (ListNode head : lists) 
        {
          ListNode temp = head;
          while (temp != null) 
          {
          arr.add(temp.val);
          temp = temp.next;
          }
        }
        if (arr.size()==0) return null;
        Collections.sort(arr);
        ListNode ans=Arraytolistnode(arr);
        return ans;

    }
    private ListNode Arraytolistnode(ArrayList<Integer> arr)
    {
        ListNode head=new ListNode(arr.get(0));
        ListNode temp=head;

        for(int i=1;i<arr.size();i++)
        {
            ListNode newnode=new ListNode(arr.get(i));
            temp.next=newnode;
            temp=temp.next;
        }
        return head;
    }

}