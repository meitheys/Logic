package exercicio13;

import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String A=sc.next();
        String B=sc.next();

        int allLenght = A.length() + B.length();
        String strV = "";

        //Making it to UpperCase at the first Letter
        String aUp = A.substring(0,1).toUpperCase() + A.substring(1);
        String bUp = B.substring(0,1).toUpperCase() + B.substring(1);

        int comparing = A.compareTo(B);

        if(comparing>0){
            strV = "Yes";
        }else{
            strV = "No";
        }

        System.out.print(allLenght + "\n" + strV + "\n" + aUp + " " + bUp);



    }

}
