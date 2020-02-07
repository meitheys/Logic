package testes.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteradorWhile {
    public static void main(String[] args) {
        ArrayList lugares = new ArrayList();
        lugares.add("Tokyo");
        lugares.add("Toronto");
        lugares.add("Paris");
        lugares.add("São Paulo");
        lugares.add("Egito");
        lugares.add("Nova York");
        lugares.add("Kyoto");
        System.out.println("Lista de locais: ");

        Iterator it = lugares.iterator();

        while(it.hasNext()){
            Object ob = it.next();
            System.out.println(ob);
        }
        System.out.println(" ");

        ListIterator lit = lugares.listIterator();

        while (lit.hasNext()){
            Object ob = lit.next();
            lit.set(ob + " City");
        }

        System.out.println("Lista modificada");
        it = lugares.iterator();

        while (it.hasNext()){
            Object ob = it.next();
            System.out.println(ob);
        }
    }
}
