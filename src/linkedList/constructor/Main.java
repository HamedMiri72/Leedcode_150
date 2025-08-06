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

        LinkedList linkedList = new LinkedList(0);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        System.out.println(linkedList.get(2).value);
        System.out.println(linkedList.set(2,5));
//        linkedList.append(3);
//        linkedList.prepend(1);
//        linkedList.printList();
//
//        linkedList.deleteFirst();
//
        linkedList.printList();


//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast());


    }
}
