package exercicio30;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {

        //Subarray is a sequence of the array like

        /*
        Array = [1,2,3]
        Array's subarrays = [1], [2], [3], [1,2], [2,3], [1,2,3].

        !Can't skip elements and do like [1,3], the 2 element is being skipped.
         */

        /*   X -->
                0 | 1 | 2 | 3 | 4 | 5 |
             0
             1     -2
             2
             3             -5
             4
             5

         */

        //A soma de um array é o total dos elementos do mesmo
        //

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //Initializing the Array with how many values that are being received in 'N'
        //If put '6' in N, the array will be Int[] arr = new int[6]
        int[] arr = new int[n];

        //Filling the array with a loop
        for(int i = 0; i < n; i++){
            /*
            Filling the array by the position especified in 'i', the loop will make the array pass through all the positions that was especified in 'n',
            once I == N, it will stop.

            The insert loop will be like this:

            1 loop with i=1, n=4
            arr[1] = scanner.nextInt();
            2 loop with i=2, n=4
            arr[2] = scanner.nextInt();
            3 loop with i=3, n=4
            arr[3] = scanner.nextInt();
            4 loop with i=4, n=4
            arr[4] = scanner.nextInt();
            then it breaks 'cause I == N
            */

            arr[i] = scanner.nextInt();
        }
        //Once we don't need scanner anymore we can close it.
            scanner.close();

        //Calculating the number os negative subarrays

        //Calculating all the subarrays and checking which one is negative
        /*
        Explaning the loops:
        Let's imagine that the input is like in the example
        1 -2 4 -5 1
        The 'i' index will loop through the whole array and it's gonna be like this
        i = 1,
        i = -2,
        i = 4,
        i = -5,
        i = 1
        */

        int arraysNegativo = 0;
        for(int i=0; i < n; i++){
            for(int j=i; j < n; j++){
                int somaAtual = 0;
                for(int k=i; k <= j; k++){
                    //somaAtual ira guardar todos os valores do array
                    somaAtual += arr[k];
                }
                //Everytime that somaAtual encontrar um valor negativo no array, ArraysNegativo incrementará
                if(somaAtual < 0){
                    arraysNegativo++;
                }

                /*
                I gets the first value from the array (1
                J gets the second value (-2)
                K will add it in a subarray form [1, -2]
                */

            }
        }
        System.out.println(arraysNegativo);
    }
}
