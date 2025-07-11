package string.lengthofthelastword;

public class Solution {


    public int lengthOfTheLastWord(String s){

        int end = s.length() - 1;

        while(end >= 0 && s.charAt(end)  == ' '){
            end--;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' '){
            start--;
        }

        return end - start;
    }
}
