package linkedList;

public class Main {

    public static void main(String[] args) {

        LL linkedList = new LL();

        linkedList.insertFirstElemnet(3);
        linkedList.insertFirstElemnet(2);
        linkedList.insertFirstElemnet(5);
        linkedList.insertFirstElemnet(7);
        linkedList.insertLast(16);
        linkedList.insert(100, 3);

        linkedList.disply();

        System.out.println(linkedList.deleteFirst());

        linkedList.disply();

        System.out.println(linkedList.deleteLast());
        linkedList.disply();

        System.out.println(linkedList.delete(1));
        linkedList.disply();

    }
}
