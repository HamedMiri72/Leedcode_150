package hackerrank.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {


      System.out.print("Print a Number: ");
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


      int x = Integer.parseInt(bufferedReader.readLine().trim());

      Solution solution = new Solution();

      String result = solution.ifelse(x);

      System.out.println("result" + "= "+ result);

      bufferedReader.close();



    }
}
