package hackerrank.ifelse.addNumbers;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        scanner.close();

        Add add = new Add();
        add.add(n1,n2);
        add.add(n1,n2,n3);
    }
}
