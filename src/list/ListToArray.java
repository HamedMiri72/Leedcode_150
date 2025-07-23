package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args){

        List<String> names = new ArrayList<>(Arrays.asList("hamed", "miri", "zeinab"));

        String[] array = names.toArray(new String[names.size()]);

        System.out.println(Arrays.toString(array));

    }
}
