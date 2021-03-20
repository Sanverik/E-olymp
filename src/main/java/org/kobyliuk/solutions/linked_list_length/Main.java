package org.kobyliuk.solutions.linked_list_length;

/**
 * Link : https://www.e-olymp.com/en/problems/9899
 * Status :  Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    int length(ListNode head){

        ListNode currNode = head;
        int lengthVal = 0;

        do {
            if (currNode != null){
                lengthVal++;
                currNode = currNode.next;
            }
        } while (currNode != null);

        return lengthVal;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
