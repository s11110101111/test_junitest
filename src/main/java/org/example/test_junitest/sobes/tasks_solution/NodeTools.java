package org.example.test_junitest.sobes.tasks_solution;

public class NodeTools {

    static class ListNode {
        ListNode next;
        int val;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            String stringNodes = "Nodes tree ";
            ListNode current = this;
            while (current.next != null) {
                stringNodes = stringNodes + current.val + ", ";
                current = current.next;
            }

            return stringNodes + current.val + ", " + null;
        }
    }


    public static ListNode revertLisnNode(ListNode head) {

        if (head == null) return null;

        ListNode currentNode = head;
        ListNode previosNode = null;
        ListNode nextNode = null;

        while (currentNode.next != null) {
            nextNode = currentNode.next;
            currentNode.next = previosNode;
            previosNode = currentNode;
            currentNode = nextNode;

        }

        currentNode.next = previosNode;
        return currentNode;

    }


    public static void main(String[] arg) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;


        System.out.println(a);
        a = revertLisnNode(a);
        System.out.println(a);

    }

}

