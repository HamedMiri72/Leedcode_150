package hackerrank.ifelse;

public class Solution {

    public String ifelse(int x){
        String result;
        if(x % 2 != 0){
            result = "weired";
        }else{
            if(x>=2 & x<=5){
                result = "No Weired";
            }else if (x<= 20 & x>=6){
                result = "Weired";
            }else{
                result = "No Weird";
            }

        }
        return result;
    }
}
