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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        ListNode head = merge;
        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    merge.next = list1;
                    merge = merge.next;
                    list1 = list1.next;
                }
                else{
                    merge.next = list2;
                    merge = merge.next;
                    list2 = list2.next;
                }
            }
            else if(list1 != null && list2 == null){
                merge.next = list1;
                merge = merge.next;
                list1 = list1.next;
            }
            else if(list1 == null && list2 != null){
                merge.next = list2;
                merge = merge.next;
                list2 = list2.next;
            }
        }
        return head.next;
    }
}