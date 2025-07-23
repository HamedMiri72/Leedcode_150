package hackerrank.ifelse.addNumbers;

public class Add {


    public void add(int... numbers){

        int sum = 0;

        StringBuilder string = new StringBuilder();

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            string.append(numbers[i]);
            if(i != numbers.length - 1){
                string.append("+");
            }
        }
        string.append("=");
        string.append(sum);
        System.out.println(string);
    }
}
