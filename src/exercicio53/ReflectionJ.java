package exercicio53;

import java.lang.reflect.Method;
import java.util.*;

public class ReflectionJ {
    public static void main(String[] args){
        Class student = ReflectionJ.class;
        Method[] methods = ReflectionJ.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods ){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
