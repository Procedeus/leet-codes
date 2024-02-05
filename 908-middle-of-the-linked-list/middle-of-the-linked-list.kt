/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var p1 = head
        var p2 = head
        while(p2 != null && p2.next != null) {
            p1 = p1?.next
            p2 = p2?.next?.next
        }
        return p1
    }
}