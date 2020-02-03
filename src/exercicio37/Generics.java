package exercicio37;

import sun.net.www.content.text.Generic;

import java.io.IOException;
import java.lang.reflect.Method;

class Printer{
    public static <P> void printArray(P[] p){
        for (P px : p){
            System.out.println(px);
        }
    }
    /*
    This will give Overload to the system =D
    public static void printArray(Integer[] arr){}
    public static void printArray(String[] arr){}
    */
}

public class Generics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
