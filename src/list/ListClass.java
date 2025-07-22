package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {

    public static void main(String[] args){

        List<String> fruits = new ArrayList<>(Arrays.asList("apple","orange","carbage"));

        String[] array = fruits.toArray(new String[fruits.size()]);

        System.out.println(Arrays.toString(array));
    }
}
