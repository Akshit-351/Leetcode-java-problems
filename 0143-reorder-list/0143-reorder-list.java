class Solution {
    public void reorderList(ListNode head) {
        ListNode prev = rev(head);
        ListNode first = head;
        while(prev != null){
            ListNode firstnext = first.next;
            ListNode secondnext = prev.next;
            first.next = prev;
            prev.next = firstnext;
            first = firstnext;
            prev = secondnext;
        }
    }
        //Reverse sec half
        public ListNode rev(ListNode head){
            ListNode slow = findMiddle(head);
             ListNode second = slow.next;
             slow.next = null;      // To disconnect the two halves
             ListNode curr = second;
            ListNode prev = null;
            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
        //FindMiddle
        public ListNode findMiddle(ListNode head){
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            }
            return slow;
        }
}