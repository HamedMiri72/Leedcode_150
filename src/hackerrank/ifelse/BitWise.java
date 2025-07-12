package hackerrank.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BitWise {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



        int t = Integer.parseInt(bufferedReader.readLine());


        for (int q = 0; q < t ; q ++){
            String[] parts = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int n = Integer.parseInt(parts[2]);

            int sum = a;

            for (int i = 0; i< n; i++){
                sum += (int) Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();

        }

        bufferedReader.close();




    }
}
