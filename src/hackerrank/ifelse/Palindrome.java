package hackerrank.ifelse;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        scanner.close();


        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse)) {
            System.out.println("ok");
        }else{
            System.out.println("No");
        }
    }
}
