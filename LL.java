class LL{
    Node head;
    private int size;
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

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
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

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

public void deleteLast(){
        Node lastNode=head.next;
        Node secondlastNode=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
    size--;
        if(head.next==null){
            head=null;
            return;
        }
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlastNode=secondlastNode.next;
        }

        secondlastNode.next=null;

}

public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
    size--;
        head=head.next;
}

public void getSize(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
    System.out.println(size);
}



    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("singular");
        list.printList();
        list.addLast("LinkdList Implementation");
        list.printList();
        list.addFirst("It");
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFirst();
        list.printList();
        list.addFirst("This");
        list.getSize();
        list.printList();
    }
}