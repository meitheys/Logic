package exercicio16;

import java.util.Scanner;

public class ReverseString {

    static boolean isOrNot(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(isOrNot(str) == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}