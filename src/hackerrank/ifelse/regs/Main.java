package hackerrank.ifelse.regs;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        scanner.nextLine();


        for (int i = 0; i < testCases; i++){

            String str = scanner.nextLine();

            try{
                Pattern.compile(str);
                System.out.println("Valid");

            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }

        }




        scanner.close();
    }
}
