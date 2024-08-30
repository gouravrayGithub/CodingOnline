
// 30-08-2024

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0); // Dummy head node
        ListNode pointer = l3; 
        int carry = 0; // Initialize carry to 0

        while (l1 != null || l2 != null) {
            int sum = carry; // Start with carry
            
            if (l1 != null) {
                sum += l1.val; // Add l1's value
                l1 = l1.next; // Move to the next node in l1
            }
            if (l2 != null) {
                sum += l2.val; // Add l2's value
                l2 = l2.next; // Move to the next node in l2
            }
            
            carry = sum / 10; // Update carry
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next; 
        }
        
        if (carry > 0) {
            pointer.next = new ListNode(carry); 
        }
        
        return l3.next; 
    }
}

