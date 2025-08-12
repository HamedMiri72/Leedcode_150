package hashTable;

public class Main {

    public static void main(String[] args){
        HashTable table = new HashTable();



        table.set("nails" , 100);
        table.set("tile", 50);
        table.set("lumber", 80);

        table.set("bolts", 200);
        table.set("screws", 140);

        table.printTable();

        System.out.println(table.get("nails"));



    }
}
