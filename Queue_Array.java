public class Queue_Array {

    // Queue implementation using array
    static class Queue{

        int arr[];
        int rear = -1;
        int size;

        Queue(int n){
            arr = new int[n];
            size = n;
        }

        // check if array is empty or not
        public boolean empty(){
            return rear == -1;
        }

        // add element to queue
        public void add(int x){
            if(rear == size-1){
                System.out.println("Queue is full");
            }
            else{
                arr[++rear] = x;
            }
        }

        // remove element from queue
        public void remove(){
            if(empty()){
                System.out.println("Queue is empty");
            }
            else{
                for(int i=0;i<rear;i++){
                    arr[i] = arr[i+1];
                }
                rear--;
            }
        }

        // get top element of queue
        public int top(){
            if(empty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return arr[0];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.empty()){
            System.out.println(q.top());
            q.remove();
        }
    }
}