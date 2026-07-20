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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // find LeftNode
        ListNode beforeLeft = dummy;
        for(int i = 1; i<left; i++){
            beforeLeft = beforeLeft.next;
        }
        // Find RightNode
        ListNode leftNode = beforeLeft.next;
        ListNode rightNode =  leftNode;
        for(int i = left; i<right; i++){
              rightNode = rightNode.next;
        }
        ListNode afterRight = rightNode.next;
        //Step 2 Break the list
        beforeLeft.next = null;
        rightNode.next = null;
        // Step 3 Reverse the list
        ListNode curr = leftNode;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        beforeLeft.next = prev;
        leftNode.next = afterRight;
        return dummy.next;
    }
}