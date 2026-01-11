
//* Definition for singly-linked list.
import java.util.*;

class LinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;

    public static boolean hasCycle(ListNode head) {
        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if (map.containsKey(temp.val)) {
                return true;
            }
            map.put(temp.val, true);
            temp = temp.next;
        }

        return false;
    }

}

public class Solution {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        LinkedList.ListNode n1 = new LinkedList.ListNode(10);
        LinkedList.ListNode n2 = new LinkedList.ListNode(20);
        LinkedList.ListNode n3 = new LinkedList.ListNode(30);
        LinkedList.ListNode n4 = new LinkedList.ListNode(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle here

        System.out.println(LinkedList.hasCycle(n1)); // true

    }
}