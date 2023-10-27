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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode cur = head, val;
        while(cur.next != null){
            val = cur.next;
            if(val.val == cur.val){
                val = val.next;
                cur.next = val;
            }
            else{
                cur = cur.next;
            }
        }
        return head;
    }
}