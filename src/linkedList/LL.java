package linkedList;

import org.w3c.dom.Node;

public class LL {

   private Node head;
   private Node tail;
   private int size;


   public LL(){
       this.size  = 0;
   }

   public void insertFirstElemnet(int value){
       Node node = new Node(value);

       node.next = head;
       head = node;

       if(tail == null){
           tail = head;
       }
       size++;
   }

   public void disply(){
       Node temp = head;
       while(temp != null){
           System.out.println(temp.value);
           temp = temp.next;
       }

   }

   private class Node{

       private int value;
       private Node next;

       public Node(int value){
           this.value = value;
       }

       public Node(int value, Node next){

           this.value = value;
           this.next = next;

       }
   }

}
