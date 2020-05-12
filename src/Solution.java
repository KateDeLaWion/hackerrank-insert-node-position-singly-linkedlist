public class Solution {
    // https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists

//    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

    // my code starts from here
        SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;

        for( int i = 0; i < position -1; i++){
            current = current.next;
        }

        nodeInsert.next = current.next;
        current.next = nodeInsert;

        return head;

// my code ends here

    }


}


