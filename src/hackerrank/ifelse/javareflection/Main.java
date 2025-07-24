package hackerrank.ifelse.javareflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Student student = new Student("hamed", "hamedmiri72@gmail.com", "123456");


        Method[] methods = student.getClass().getDeclaredMethods();

        List<String> methodNames = new ArrayList<>();

        for(Method method : methods){
            methodNames.add(method.getName());
        }

        for(String methodName : methodNames){
            System.out.println(methodName);
        }
    }
}
