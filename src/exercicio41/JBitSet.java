package exercicio41;

import java.util.BitSet;
import java.util.Scanner;

public class JBitSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorBitSet = in.nextInt();
        if(valorBitSet > 1000 || valorBitSet < 1){ throw new IllegalArgumentException("Valor do BitSet deve estar entre 1 e 1000"); }
        int entradas = in.nextInt();
        if(entradas > 10000 || entradas < 1){ throw new IllegalArgumentException("As entradas precisam estar entre 1 e 10000"); }
        BitSet bs1 = new BitSet(valorBitSet);
        BitSet bs2 = new BitSet(valorBitSet);

        for (int i = 0; i < entradas; i++) {
            String a = in.next();
            int objeto = in.nextInt();
            if(objeto != 0 || objeto != 1){
                throw new IllegalArgumentException("O valor informado deve corresponder a 0 ou 1!");
            }
            int coordenada = in.nextInt();

            if (a.equals("AND")) {
                if(objeto == 1){
                    bs1.and(bs2);
                }else
                    bs2.and(bs1);
            }

            else if (a.equals("SET")) {
                if (objeto == 1){
                    bs1.set(coordenada);
                }else{
                    bs2.set(coordenada);
                }
            }

            else if (a.equals("OR")) {
                if(objeto == 1){
                    bs1.or(bs2);
                }else{
                    bs2.or(bs1);
                }
            }

            else if (a.equals("XOR")) {
                if (objeto == 1){
                    bs1.xor(bs2);
                }else
                    bs2.xor(bs1);
            }

            else if (a.equals("FLIP")) {
                if (objeto == 1){
                    bs1.flip(coordenada);
                }else{
                    bs2.flip(coordenada);
                }
            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }
    }
}