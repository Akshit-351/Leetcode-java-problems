class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode curr = head;

        while (curr != null) {

            // Step 1: Find kth node
            ListNode kth = curr;
            for (int i = 1; i < k; i++) {
                if (kth == null)
                    return dummy.next;
                kth = kth.next;
            }

            // Less than k nodes left
            if (kth == null)
                break;

            // Step 2: Save next group
            ListNode nextGroup = kth.next;

            // Step 3: Break the list
            kth.next = null;

            // Step 4: Reverse current group (LC 206)
            ListNode prev = null;
            ListNode node = curr;

            while (node != null) {
                ListNode next = node.next;
                node.next = prev;
                prev = node;
                node = next;
            }

            // Step 5: Connect previous group with reversed group
            prevGroup.next = prev;

            // Step 6: Connect tail with next group
            curr.next = nextGroup;

            // Step 7: Move pointers for next iteration
            prevGroup = curr;
            curr = nextGroup;
        }

        return dummy.next;
    }
}