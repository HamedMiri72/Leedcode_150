package hackerrank.ifelse.tokenizer;

public class Tokenizer {

    public static String tokenize(String str){

       String[] tokens = str.trim().split("[^A-Za-z]+");

       StringBuilder result = new StringBuilder();

       if(str == null || str.isEmpty()){
           System.out.print("0");
           return "0";
       }

       result.append(tokens.length).append("\n");

       for(String token: tokens){

           result.append(token).append("\n");

       }

       return result.toString().trim();

    }


}
