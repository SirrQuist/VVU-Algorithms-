class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    
    Node head, tail = null;  
   
    //add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null
            //and tail's next will be null
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes   
    public void printNodes() {  
      
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
class Main{
    public static void main(String[] args) {  
        //create a DoublyLinkedList object
        DoublyLinkedList DL_List = new DoublyLinkedList();  
        //Add nodes to the list  
        DL_List.addNode(15);  
        DL_List.addNode(35);  
        DL_List.addNode(58);  
        DL_List.addNode(11);  
        DL_List.addNode(45);  
   
        //print the nodes of DoublyLinkedList  
        DL_List.printNodes();  
    }  
} 
