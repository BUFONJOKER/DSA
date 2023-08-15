import java.util.*;

public class Stack_Problems {

    public Stack<Integer> list = new Stack<>();
    public Stack<Integer> newList = new Stack<>();

    public void push_bottom(int n) {

        newList.push(n);

        int size = list.size();

        for (int index = 0; index < size; index++) {

            newList.push(list.get(index));

        }

        System.out.println(newList);

    }

    public void reversestack(){
        System.out.println("List before reverse : "+list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            newList.push(list.pop());
        }

        System.out.println("List after reverse : "+newList);

    
    }

    public static void main(String[] args) {

        System.out.println();

        Stack_Problems s = new Stack_Problems();

        s.list.push(1);
        s.list.push(2);
        s.list.push(3);

        s.reversestack();

        // s.push_bottom(4);



        System.out.println();

    }
}
