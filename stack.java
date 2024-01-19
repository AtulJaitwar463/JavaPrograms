public class stack {
    //----------------------------in linked list form---------------------------
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;

        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head ==null;
        }

        //insert data in stack
        public static void push(int data){
            Node newNode =new Node(data);
            if(isEmpty()){
                head=newNode;;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //delete data in stack
        public static int pop(){
            if(isEmpty()){
                
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
//  peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
