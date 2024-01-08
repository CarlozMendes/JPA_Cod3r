package org.basico;

import java.security.SecureRandom;
public class Aula08_Matrizes {
    public static void main(String[] args) {
        final int LINHAS = 3;
        final int COLUNAS = 5;

        int [][] numeros = new int[LINHAS][COLUNAS];
        int [][] numeros2 = {{10,20,30,40,50},{1,2,3,4,5},{100,200,300,400,500}};


        for(int l=0 ; l<LINHAS ; l++){
            for( int c=0 ; c<COLUNAS ; c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for ( int[] cc : numeros){
            for (int ccc: cc){
                System.out.print(ccc+" ");
            }
        }



        for(int l=0 ; l < numeros2.length ; l++){
            for(int c=0 ; c<numeros2[l].length ; c++){
                System.out.printf("%d | ", numeros[l][c]);
            }
        }
//        for(int[] v:numeros2){
//            for(int d:v){
//                System.out.printf("%2d | ",v);
//            }
//        }
        System.out.println(" ");
    }
}
