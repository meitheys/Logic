package exercicio20;

import java.util.Scanner;

public class Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    /*  [01]?\\d{1,2}   numbers from 0-199
        2[0-4]\\d                    200-249
        25[0-5]                      250-255
     */

    String n = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = n + "." + n + "." + n + "." + n;
}

