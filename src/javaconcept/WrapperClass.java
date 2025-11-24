package javaconcept;

public class WrapperClass {
    public static void main(String[] args){


        Integer number1 = new Integer(55);
        Integer numsber2 = new Integer("55");

        System.out.println(number1 + " " + numsber2);


        Integer number3 = Integer.valueOf("55");

        System.out.println(number1 + " " + numsber2 + " " + number3);


        Integer a = new Integer(100);
        Integer b = new Integer(100);

        Integer c = Integer.valueOf(100);
        Integer d = Integer.valueOf(100);

        Integer e = Integer.valueOf(200);
        Integer f = Integer.valueOf(200);

        System.out.println(a == b); // false (two different objects)
        System.out.println(c == d); // true  (cached objects)
        System.out.println(e == f); // false (outside cache range)


        //Autoboxing and Unboxing

        Integer x = 100;
        int y = x; // x.intValue()
        System.out.println(x == y);


        int xx = 100;
        Integer yy = xx; // new Integer(xx)
        System.out.println(xx == yy);

        Integer aa = 100;   // autoboxing
        Integer bb = 100;   // autoboxing

        System.out.println(a == b);   // true (cached)


        Integer cc = 200;
        Integer dd = 200;

        System.out.println(c == d);   // false (outside cache)

    }
}
