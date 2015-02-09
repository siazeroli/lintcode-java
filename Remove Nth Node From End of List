//Remove Nth Node From End of List
/*Given a linked list, remove the nth node from the end of list and return its head.

Note
The minimum number of nodes in list is n.

Example
Given linked list: 1->2->3->4->5->null, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5->null.
Challenge
O(n) time*/
//tag: linked list, two pointers

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        //if head is empty, return head directly
        if (head == null){
            return head;
        }
        //to count the length of linked list
        ListNode node = head;
        int counter = 1;
        while (node.next != null){
            counter++;
            node = node.next;
        }
        //get the position we need to remove from the start
        counter = counter - n + 1;
        //if remove the first one, we just need to point head from next one.
        if (counter == 1){
            ListNode newNode = head;
            newNode = head.next;
            head.next = null;
            head = newNode;
        }
        //if not, we need to two pointers to do this.
        else{
            ListNode curNode = head;
            while (counter > 1){
                counter--;
                curNode = curNode.next;
            }
            ListNode preNode = head;
            while (preNode.next != curNode){
                preNode = preNode.next;
            }
            preNode.next = curNode.next;
            curNode.next = null;
        }
        return head;
    }
}
