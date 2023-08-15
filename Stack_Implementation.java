import java.util.*;

public class Stack_Implementation {

    // Stack implementation using Linked List
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack_LinkedList {

        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {

            Node newNode = new Node(data);

            if (isEmpty()) {

                head = newNode;

                return;
            }

            newNode.next = head;

            head = newNode;

        }

        public static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = head.data;

            head = head.next;

            return top;
        }

        public static int peek() {

            if (isEmpty()) {
                return -1;
            }

            int top = head.data;

            return top;
        }

    }

    // Stack implementation using Array List

    static class Stack_ArrayList {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean stack_empty() {

            return list.size() == 0;
        }

        // push

        public static void push(int data) {

            list.add(data);
        }

        // pop

        public static int pop() {

            if (stack_empty()) {

                return -1;
            }

            int top = list.get(list.size() - 1);

            list.remove(list.size() - 1);

            return top;
        }

        // peek

        public static int peek() {

            if (stack_empty()) {

                return -1;
            }

            int peek = list.get(list.size() - 1);

            return peek;
        }
    }

    public static void main(String[] args) {

        System.out.println();

        // Stack implementation using Java Collection Framework

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

         while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        

        // Stack_ArrayList.push(1);

        // Stack_ArrayList.push(2);

        // Stack_ArrayList.push(3);

        // Stack_ArrayList.push(4);

        // while(!Stack_ArrayList.stack_empty()){
        //     System.out.println(Stack_ArrayList.peek());
        //     Stack_ArrayList.pop();
        // }


        // Stack.push(1);
        // Stack.push(2);
        // Stack.push(3);
        // Stack.push(4);

        // while(!Stack.isEmpty()){
        // System.out.print(Stack.peek() + " ");
        // Stack.pop();
        // }

        System.out.println();
        System.out.println();
    }
}