package exercicio17;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String A, String B) {
        int aLength = A.length();
        int bLength = B.length();

        if (aLength != bLength)
            return false;

        //Tudo pra minusculo
        A = A.toLowerCase();
        B = B.toLowerCase();

        //26 para toda letra do alfabeto
        int[] charF = new int[26];

        //Loopa entre o Array do Alfabeto
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
