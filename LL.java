class LL{
    Node head;
    private  int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }

    //insert begin node
    public void addBegin(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //insert last node
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        } 
        currNode.next=newNode;
    }
    //insert middle in node
    public void addMiddle(String data,int position){
       if(position <0){
           throw new IllegalArgumentException("Invalid valueof position ="+position);
       }
       Node newNode=new Node(data);
       if(position==0){
           newNode.next = head;
           head = newNode;
           return;

       }
       Node currentnode =head;;
       for (int i=0;i<position-1;i++){
           currentnode=currentnode.next;
           if(currentnode==null){
               throw new IllegalArgumentException("value of position = "+position+"is greater");
           }

       }

       //size++;

       newNode.next=currentnode.next;
       currentnode.next=newNode;



    }

    //Delete  first node

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }


    //Delete last node

    public  void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }

    public int getSize(){
        return size;

    }

    //print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;

        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addBegin("a");
        list.printList();;

        list.addBegin("is");
        list.printList();

        int position=1;
        String data="atul";
        list.addMiddle(data, position);
        list.printList();;

        list.addLast("List");
        list.printList();

        list.deleteFirst();;
        list.printList();;

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}