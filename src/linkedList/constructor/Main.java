package linkedList.constructor;

public class Main {

    public static void main(String[] args){

//        LinkedList linkedList = new LinkedList(4);
//        linkedList.append(3);
//
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
//
//        linkedList.printList();

        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);


        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast());


    }
}
