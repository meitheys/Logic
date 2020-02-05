package testes.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();;
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.add("F");
        items.add("G");
        items.add("H");
        items.add("I");
        items.add("J");

        //Foreach with lambda expression
        items.forEach(item -> System.out.println(item));

        items.stream()
                .filter(s -> s.contains("B"))
                .forEach(System.out::println);
    }
}