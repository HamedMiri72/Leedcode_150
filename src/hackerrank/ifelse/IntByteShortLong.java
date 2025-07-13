package hackerrank.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntByteShortLong {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {

            String stringNumber = bufferedReader.readLine();

            try {
                Long number = Long.parseLong(stringNumber);

                System.out.println(number + " can be fitted in:");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(stringNumber + " can't be fitted anywhere.");
            }
        }
    }
}
