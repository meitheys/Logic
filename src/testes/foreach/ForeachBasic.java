package testes.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForeachBasic {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for (String Items : items) {
            System.out.println(Items);
        }
    }
}
