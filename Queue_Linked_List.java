public class Queue_Linked_List {

    // Queue implementation using Linked List

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class Queue {

        Node head = null;
        Node tail = null;

        // check if array is empty or not
        public boolean empty() {
            return head == null && tail == null;
        }

        // add element to queue
        public void add(int data) {
            Node newNode = new Node(data);

            if(tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        // remove element from queue
        public int remove() {
            if (empty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;

        }

        // get top element of queue
        public int top() {
            return head.data;
        }
    }

    public static void main(String[] args) {
        System.out.println();

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.empty()) {
            System.out.println(q.top());
            q.remove();
        }

        System.out.println();
    }
}