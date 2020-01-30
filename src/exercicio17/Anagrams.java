package exercicio17;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String A, String B) {
        int aLength = A.length();
        int bLength = B.length();

        //Ve se tem a mesma quantidade de digitos.
        if (aLength != bLength)
            return false;

        //Tudo pra minusculo
        A = A.toLowerCase();
        B = B.toLowerCase();

        //26 para toda letra do alfabeto
        int[] charF = new int[26];

        //https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm <------------- ASCII
        //Loopa entre o Array do Alfabeto

        //Verifica se tal palavra tem tal letra: Ex: "gato", verifica se tem A,B,C,D,E,F... E se a 2 palavra também tem, por exemplo: "AGTO"
        for (int i = 0; i < aLength; i++) {
            char current = A.charAt(i);
            int index = current - 'a';
            charF[index]++;
        }
        for (int i = 0; i < bLength; i++) {
            char current = B.charAt(i);
            int index = current - 'a';
            charF[index]--;
        }
        for(int i=0; i<26; i++){
            if(charF[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
