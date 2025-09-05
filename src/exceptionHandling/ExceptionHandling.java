package exceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args){

        //ArithmeticException
//        int n = 10;
//        int m = 0;
//        int ans = n / m;
//        System.out.println("Answer: " + ans);

        int n = 10;
        int m = 0;

        try{
            int ans = n / m;
            System.out.println("Ans: " + ans);
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed!");
        }finally {
            System.out.println("program continue after handling the exception!");
        }


    }
}
