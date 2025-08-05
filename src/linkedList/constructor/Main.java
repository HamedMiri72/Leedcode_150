package linkedList.constructor;

public class Main {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList(4);
        linkedList.append(3);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.printList();
    }
}
