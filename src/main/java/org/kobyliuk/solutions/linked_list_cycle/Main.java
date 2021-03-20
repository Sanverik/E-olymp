package org.kobyliuk.solutions.linked_list_cycle;

/**
 * Link : https://www.e-olymp.com/en/problems/10043
 * Status :  Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);
        n1.next.next.next.next = new ListNode(5);

        // cycle
        n1.next.next.next.next.next = n1.next.next;

        ListNode startOfCycle = detectCycle(n1);
    }

    static ListNode detectCycle(ListNode head) {

        ListNode[] visitedNodes = new ListNode[100000];
        ListNode cycledStartNode = null;
        int nVisitedNodes = 0;

        ListNode currNode = head;

        while (currNode != null){
            visitedNodes[nVisitedNodes] = currNode;
            nVisitedNodes++;
            if (containsNode(visitedNodes, currNode.next, nVisitedNodes)){
                cycledStartNode = currNode.next;
                break;
            }
            currNode = currNode.next;
        }

        return cycledStartNode;
    }

    private static boolean containsNode(ListNode[] arr, ListNode node, int limit){

        for (int i = 0; i < limit; i++){
            if (arr[i].equals(node)){
                return true;
            }
        }
        return false;
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
