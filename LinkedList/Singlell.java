import java.util.*;

class Node{
    public int value;
    public Node next;
}

class SinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        //head = new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1; 
        return head; 

    }

    public void insertSinglyLinkedList(int nodeValue, int location){
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);

        }else if(location==0){
            node.next=head;
            head=node;

        }else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;

        }else{
            Node tempnode=head;
            int index=0;
            while(index<location-1){
                tempnode=tempnode.next;
                index++;
            }
            Node nextNode=tempnode.next; 
            tempnode.next=node;
            node.next=nextNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if(head==null){
            System.out.println("linked list doesnt exist");
        }else{
            Node tempnode=head;
            for(int i=0;i<size;i++){
                System.out.println(tempnode.value);
                //System.out.println(" ");
                tempnode=tempnode.next;
            }
        }
        //System.out.println("\n");
    }

    boolean SearchNode(int nodeValue){
        if(head!=null){
            Node tempNode=head;
            
        }
    }
}

public class Singlell{
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        //System.out.println(sll.head.value);
        //System.out.println(sll.tail.value);
        sll.insertSinglyLinkedList(4, 1);
       // System.out.println(sll.head.value);
        sll.insertSinglyLinkedList(6, 3);
        sll.insertSinglyLinkedList(7, 4);
        sll.insertSinglyLinkedList(8, 5);
        sll.insertSinglyLinkedList(9, 6);
        sll.traverseSinglyLinkedList();


    }
}