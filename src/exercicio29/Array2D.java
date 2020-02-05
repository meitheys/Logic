package exercicio29;

import java.util.Scanner;

public class Array2D {
    private static final Scanner scanner = new Scanner(System.in);

        //Array 6x6
        /*
            [6]
        [6] X X X X X X
            X X X X X X
            X X X X X X
            X X X X X X
            X X X X X X
            X X X X X X
         */

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //Criando array
            int a[][] = new int[6][6];

            //Contem a soma das posições do Array
            //Se não iniciar como MIN_VALUE e sim com int = 0 o Array não aceitará numeros menores que zero.
            int soma= Integer.MIN_VALUE;

            //Cria a variavel que conterá a maior soma do array
            int maiorSoma=Integer.MIN_VALUE;

            //Popula o Array com o Scanner
            for(int i=0; i < 6; i++){
                for(int j=0; j < 6; j++){
                    a[i][j] = in.nextInt();
                }
            }

            //O 4 é porque a hourglass vai até a 3 linha. e 3+1
            for(int i=0; i < 4; i++){
                for(int j=0; j < 4; j++){

                    //Pega as cominações do Array para somar
                    //As combinações equivalem as coordenadas da ampulheta
                    soma=       a[i][j]   +a[i][j+1]    +a[i][j+2]
                                          +a[i+1][j+1]
                               +a[i+2][j] +a[i+2][j+1]  +a[i+2][j+2];

                    if(soma>maiorSoma) maiorSoma=soma;
                }
            }
            scanner.close();
            System.out.println(maiorSoma);
        }

    }