package hackerrank.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormatedOutput {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));


//        String input = bufferReader.readLine();
//        System.out.print("Enter a Number: ");
//        int num = Integer.parseInt(bufferReader.readLine());
//        System.out.println("now enter multiple entegers");
//        String[] parts = bufferReader.readLine().split(" ");
//        int a = Integer.parseInt(parts[0]);
//        int b = Integer.parseInt(parts[1]);
//
//        String[] list = bufferReader.readLine().split(",");
//
//        int c = Integer.parseInt(list[0]);
//        int d = Integer.parseInt(list[1]);
//
//        System.out.println("Tokens example: ");
//
//        String[] tokens = bufferReader.readLine().split(" ");
//        int[] arr = new int[tokens.length];
//        for(int i =0; i< tokens.length; i++){
//            arr[i] = Integer.parseInt(tokens[i]);
//        }
//
//        System.out.println(arr);


//        System.out.println("You Entered :"+ input);
//        System.out.println("Your chosen number is :" + num);
//        System.out.println(a+b);
//        System.out.println(c);
//        System.out.println(d);

//        bufferReader.close();


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("================================");
//
//       for(int i=0; i<3 ; i++){
//           String line = bufferedReader.readLine();
//
//
//           String[] parts = line.split(" ");
//
//           String s = parts[0];
//           int x = Integer.parseInt(parts[1]);
//
//           System.out.printf("%-15s%03d%n", s, x);
//       }
//
//        System.out.println("================================");
//
//
//        bufferedReader.close();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[3];
        int[] num = new int[3];

        for(int i=0; i< 3; i++){
            String[] parts = bufferedReader.readLine().split(" ");
            s[i] = parts[0];
            num[i] = Integer.parseInt(parts[1]);
        }

        System.out.println("================================");
        for(int i=0; i<3; i++){
            System.out.printf("%-15s%03d%n",s[i],num[i]);
        }

        System.out.println("================================");

        bufferedReader.close();
    }
}
