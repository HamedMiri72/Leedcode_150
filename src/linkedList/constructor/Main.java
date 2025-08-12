package linkedList.constructor;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(4);

        list.printList();
        list.getTail();
        list.getHead();
        list.getLength();

        list.append(3);
        list.printList();

        list.removeLast();
        list.printList();

        System.out.println("------------");

        list.prepend(1);
        list.printList();

        System.out.println(list.get(1).value);

    }


}
