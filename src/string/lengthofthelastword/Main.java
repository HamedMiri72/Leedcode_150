package string.lengthofthelastword;

public class Main {

    public static void main(String[] args){

        String s = "Hello      world    ";


        Solution solution = new Solution();


        int length = solution.lengthOfTheLastWord(s);

        System.out.println(length);
    }
}
